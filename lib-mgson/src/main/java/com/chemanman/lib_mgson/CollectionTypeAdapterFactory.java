package com.chemanman.lib_mgson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.$Gson$Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
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
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/**
 * 自定义列表解析适配器
 *
 * @author huilin
 */
class CollectionTypeAdapterFactory implements TypeAdapterFactory {
    private final ConstructorConstructor constructorConstructor;

    public CollectionTypeAdapterFactory(ConstructorConstructor constructorConstructor) {
        this.constructorConstructor = constructorConstructor;
    }

    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Type type = typeToken.getType();

        Class<? super T> rawType = typeToken.getRawType();
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

        if (typeTokens.contains(rawType)) {
            return null;
        }
        if ((typeToken.getType() instanceof GenericArrayType || typeToken.getType() instanceof Class && ((Class<?>) typeToken.getType()).isArray())) {
            return null;
        }

        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }

        //结束
        Type elementType = $Gson$Types.getCollectionElementType(type, rawType);
        TypeAdapter<?> elementTypeAdapter = gson.getAdapter(TypeToken.get(elementType));
        ObjectConstructor<T> constructor = constructorConstructor.get(typeToken);

        // create() doesn't define a type parameter
        @SuppressWarnings({"unchecked", "rawtypes"})
        TypeAdapter<T> result = new Adapter(gson, elementType, elementTypeAdapter, constructor);

        return result;
    }

    private static final class Adapter<E> extends TypeAdapter<Collection<E>> {

        private final TypeAdapter<E> elementTypeAdapter;
        private final ObjectConstructor<? extends Collection<E>> constructor;

        public Adapter(Gson context, Type elementType,
                       TypeAdapter<E> elementTypeAdapter,
                       ObjectConstructor<? extends Collection<E>> constructor) {
            this.elementTypeAdapter = new TypeAdapterRuntimeTypeWrapper<E>(context, elementTypeAdapter, elementType);
            this.constructor = constructor;
        }

        @Override
        public Collection<E> read(JsonReader in) throws IOException {
            if (in.peek() == JsonToken.NULL) {
                in.nextNull();
                return constructor.construct();
            }
            //增加判断是错误OBJECT的类型（应该是object）,移动in的下标到结束，移动下标的代码在下方
            if (in.peek() == JsonToken.BEGIN_OBJECT) {
                GsonTools.readObject(in);
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
            //增加判断是错误的boolean的类型（应该是object）,移动in的下标到结束，移动下标的代码在下方
            if (in.peek() == JsonToken.BOOLEAN) {
                in.nextBoolean();
                return constructor.construct();
            }

            Collection<E> collection = constructor.construct();
            in.beginArray();
            while (in.hasNext()) {
                E instance = elementTypeAdapter.read(in);
                collection.add(instance);
            }
            in.endArray();
            return collection;
        }

        @Override
        public void write(JsonWriter out, Collection<E> collection) throws IOException {
            if (collection == null) {
                out.nullValue();
                return;
            }

            out.beginArray();
            for (E element : collection) {
                elementTypeAdapter.write(out, element);
            }
            out.endArray();
        }
    }
}
