package com.chemanman.lib_mgson;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.$Gson$Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Primitives;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;


/**
 * 自定义对象Object解析适配器
 *
 * @author huilin
 */
class ReflectiveTypeAdapterFactory implements TypeAdapterFactory {
    private final ConstructorConstructor constructorConstructor;
    private final FieldNamingStrategy fieldNamingPolicy;
    private final Excluder excluder;

    public ReflectiveTypeAdapterFactory(ConstructorConstructor constructorConstructor,
                                        FieldNamingStrategy fieldNamingPolicy, Excluder excluder) {
        this.constructorConstructor = constructorConstructor;
        this.fieldNamingPolicy = fieldNamingPolicy;
        this.excluder = excluder;
    }

    public boolean excludeField(Field f, boolean serialize) {
        return excludeField(f, serialize, excluder);
    }

    static boolean excludeField(Field f, boolean serialize, Excluder excluder) {
        return !excluder.excludeClass(f.getType(), serialize) && !excluder.excludeField(f, serialize);
    }

    private List<String> getFieldNames(Field f) {
        return getFieldName(fieldNamingPolicy, f);
    }

    static List<String> getFieldName(FieldNamingStrategy fieldNamingPolicy, Field f) {
        SerializedName serializedName = f.getAnnotation(SerializedName.class);
        List<String> fieldNames = new LinkedList<String>();
        if (serializedName == null) {
            fieldNames.add(fieldNamingPolicy.translateName(f));
        } else {
            fieldNames.add(serializedName.value());
            for (String alternate : serializedName.alternate()) {
                fieldNames.add(alternate);
            }
        }
        return fieldNames;
    }

    @Override
    public <T> TypeAdapter<T> create(Gson gson, final TypeToken<T> type) {
        Class<? super T> raw = type.getRawType();
        //不对以下类型做适配 以Gson有参构造顺序加入
        ArrayList<Class> typeTokens = new ArrayList<>();
        typeTokens.add(String.class);
        typeTokens.add(Integer.class);
        typeTokens.add(Boolean.class);
        typeTokens.add(Byte.class);
        typeTokens.add(Short.class);
        typeTokens.add(Long.class);
        typeTokens.add(Double.class);
        typeTokens.add(Float.class);
        typeTokens.add(Number.class);
        typeTokens.add(AtomicInteger.class);
        typeTokens.add(AtomicBoolean.class);
        typeTokens.add(AtomicLong.class);
        typeTokens.add(AtomicLongArray.class);
        typeTokens.add(AtomicIntegerArray.class);
        typeTokens.add(Character.class);
        typeTokens.add(StringBuilder.class);
        typeTokens.add(StringBuffer.class);
        typeTokens.add(BigDecimal.class);
        typeTokens.add(BigInteger.class);
        typeTokens.add(URL.class);
        typeTokens.add(URI.class);
        typeTokens.add(UUID.class);
        typeTokens.add(Currency.class);
        typeTokens.add(Locale.class);
        typeTokens.add(InetAddress.class);
        typeTokens.add(BitSet.class);
        typeTokens.add(Date.class);
        typeTokens.add(GregorianCalendar.class);
        typeTokens.add(Calendar.class);
        typeTokens.add(Time.class);
        typeTokens.add(java.sql.Date.class);
        typeTokens.add(Timestamp.class);
        typeTokens.add(Class.class);

        if (typeTokens.contains(raw)) {
            return null;
        }
        if ((type.getType() instanceof GenericArrayType || type.getType() instanceof Class && ((Class<?>) type.getType()).isArray())) {
            return null;
        }
        if (!Object.class.isAssignableFrom(raw)) {
            return null;
        }
        if (Collection.class.isAssignableFrom(raw)) {
            return null;
        }
        if (Map.class.isAssignableFrom(raw)) {
            return null;
        }
        JsonAdapter annotation = raw.getAnnotation(JsonAdapter.class);
        if (annotation != null) {
            return null;
        }
        if (Enum.class.isAssignableFrom(raw) && raw != Enum.class) {
            return null;
        }
        //结束

        ObjectConstructor<T> constructor = constructorConstructor.get(type);
        return new Adapter<T>(constructor, getBoundFields(gson, type, raw));
    }

    private ReflectiveTypeAdapterFactory.BoundField createBoundField(final Gson context,
                                                                     final Field field,
                                                                     final String name,
                                                                     final TypeToken<?> fieldType,
                                                                     boolean serialize,
                                                                     boolean deserialize) {

        final boolean isPrimitive = Primitives.isPrimitive(fieldType.getRawType());

        return new ReflectiveTypeAdapterFactory.BoundField(name, serialize, deserialize) {

            final TypeAdapter<?> typeAdapter = getFieldAdapter(context, field, fieldType);

            @SuppressWarnings({"unchecked", "rawtypes"})
            @Override
            void write(JsonWriter writer, Object value)
                    throws IOException, IllegalAccessException {
                Object fieldValue = field.get(value);
                TypeAdapter t = new TypeAdapterRuntimeTypeWrapper(context, this.typeAdapter, fieldType.getType());
                t.write(writer, fieldValue);
            }

            @Override
            void read(JsonReader reader, Object value)
                    throws IOException, IllegalAccessException {
                Object fieldValue = typeAdapter.read(reader);
                if (fieldValue != null || !isPrimitive) {
                    field.set(value, fieldValue);
                }
            }

            @Override
            public boolean writeField(Object value) throws IOException, IllegalAccessException {
                if (!serialized) {
                    return false;
                }

                Object fieldValue = field.get(value);
                return fieldValue != value;
            }
        };
    }

    TypeAdapter<?> getFieldAdapter(Gson gson, Field field, TypeToken<?> fieldType) {
        JsonAdapter annotation = field.getAnnotation(JsonAdapter.class);
        if (annotation != null) {
            TypeAdapter<?> adapter = getTypeAdapter(constructorConstructor, gson, fieldType, annotation);
            if (adapter != null) {
                return adapter;
            }
        }
        return gson.getAdapter(fieldType);
    }

    static TypeAdapter<?> getTypeAdapter(ConstructorConstructor constructorConstructor,
                                         Gson gson,
                                         TypeToken<?> fieldType,
                                         JsonAdapter annotation) {
        Class<?> value = annotation.value();
        TypeAdapter<?> typeAdapter;

        if (TypeAdapter.class.isAssignableFrom(value)) {
            Class<TypeAdapter<?>> typeAdapterClass = (Class<TypeAdapter<?>>) value;
            typeAdapter = constructorConstructor.get(TypeToken.get(typeAdapterClass)).construct();
        } else if (TypeAdapterFactory.class.isAssignableFrom(value)) {
            Class<TypeAdapterFactory> typeAdapterFactory = (Class<TypeAdapterFactory>) value;
            typeAdapter = constructorConstructor.get(TypeToken.get(typeAdapterFactory))
                    .construct()
                    .create(gson, fieldType);
        } else {
            throw new IllegalArgumentException(
                    "@JsonAdapter value must be TypeAdapter or TypeAdapterFactory reference.");
        }

        if (typeAdapter != null) {
            typeAdapter = typeAdapter.nullSafe();
        }

        return typeAdapter;
    }

    private Map<String, BoundField> getBoundFields(Gson context, TypeToken<?> type, Class<?> raw) {
        Map<String, BoundField> result = new LinkedHashMap<>();
        if (raw.isInterface()) {
            return result;
        }

        Type declaredType = type.getType();
        while (raw != Object.class) {
            Field[] fields = raw.getDeclaredFields();
            for (Field field : fields) {
                boolean serialize = excludeField(field, true);
                boolean deserialize = excludeField(field, false);
                if (!serialize && !deserialize) {
                    continue;
                }
                field.setAccessible(true);
                Type fieldType = $Gson$Types.resolve(type.getType(), raw, field.getGenericType());
                List<String> fieldNames = getFieldNames(field);
                BoundField previous = null;
                for (int i = 0; i < fieldNames.size(); ++i) {
                    String name = fieldNames.get(i);
                    if (i != 0) {
                        // only serialize the default name
                        serialize = false;
                    }
                    BoundField boundField = createBoundField(context, field, name,
                                                             TypeToken.get(fieldType), serialize, deserialize);
                    BoundField replaced = result.put(name, boundField);
                    if (previous == null) {
                        previous = replaced;
                    }
                }
                if (previous != null) {
                    throw new IllegalArgumentException(declaredType
                                                               + " declares multiple JSON fields named " + previous.name);
                }
            }
            type = TypeToken.get($Gson$Types.resolve(type.getType(), raw, raw.getGenericSuperclass()));
            raw = type.getRawType();
        }
        return result;
    }

    static abstract class BoundField {
        final String name;
        final boolean serialized;
        final boolean deserialized;

        protected BoundField(String name, boolean serialized, boolean deserialized) {
            this.name = name;
            this.serialized = serialized;
            this.deserialized = deserialized;
        }

        abstract boolean writeField(Object value) throws IOException, IllegalAccessException;

        abstract void write(JsonWriter writer, Object value) throws IOException, IllegalAccessException;

        abstract void read(JsonReader reader, Object value) throws IOException, IllegalAccessException;
    }

    public static final class Adapter<T> extends TypeAdapter<T> {
        private final ObjectConstructor<T> constructor;
        private final Map<String, BoundField> boundFields;

        Adapter(ObjectConstructor<T> constructor, Map<String, BoundField> boundFields) {
            this.constructor = constructor;
            this.boundFields = boundFields;
        }

        @Override
        public T read(JsonReader in) throws IOException {
            if (in.peek() == JsonToken.NULL) {
                in.nextNull();
                return constructor.construct();
            }
            //增加判断是错误的ARRAY的类型（应该是object）,移动in的下标到结束，移动下标的代码在下方
            if (in.peek() == JsonToken.BEGIN_ARRAY) {
                GsonTools.readArray(in);
                return constructor.construct();
            }
            //增加判断是错误的NUMBER的类型（应该是object）,移动in的下标到结束，移动下标的代码在下方
            if (in.peek() == JsonToken.NUMBER) {
                in.nextDouble();
                return constructor.construct();
            }
            //增加判断是错误的String的类型（应该是object）,移动in的下标到结束，移动下标的代码在下方
            if (in.peek() == JsonToken.STRING) {
                in.nextString();
                return constructor.construct();
            }
            //增加判断是错误的name的类型（应该是object）,移动in的下标到结束，移动下标的代码在下方
            if (in.peek() == JsonToken.NAME) {
                in.nextName();
                return constructor.construct();
            }
            //增加判断是错误的bookean的类型（应该是object）,移动in的下标到结束，移动下标的代码在下方
            if (in.peek() == JsonToken.BOOLEAN) {
                in.nextBoolean();
                return constructor.construct();
            }

            T instance = constructor.construct();
            try {
                in.beginObject();
                while (in.hasNext()) {
                    String name = in.nextName();
                    BoundField field = boundFields.get(name);
                    if (field == null || !field.deserialized) {
                        in.skipValue();
                    } else {
                        field.read(in, instance);
                    }
                }
            } catch (IllegalStateException e) {
                throw new JsonSyntaxException(e);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
            in.endObject();
            return instance;
        }

        @Override
        public void write(JsonWriter out, T value) throws IOException {
            if (value == null) {
                out.nullValue();
                return;
            }

            out.beginObject();
            try {
                for (BoundField boundField : boundFields.values()) {
                    if (boundField.writeField(value)) {
                        out.name(boundField.name);
                        boundField.write(out, value);
                    }
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
            out.endObject();
        }
    }
}
