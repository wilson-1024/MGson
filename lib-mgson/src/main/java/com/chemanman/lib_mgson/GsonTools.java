package com.chemanman.lib_mgson;

import java.io.IOException;

import android.os.Looper;
import android.util.Log;
import com.chemanman.lib_mgson.util.StringUtils;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;


/**
 * Created by huilin on 2017/9/12.
 */
class GsonTools {

    /**
     * 解析jsonArray
     *
     * @param in json数据
     *
     * @throws IOException
     */
    static void readArray(JsonReader in)
            throws IOException {
        in.beginArray();
        readJson(in);
        in.endArray();
    }

    /**
     * 解析jsonObject
     *
     * @param in json数据
     *
     * @throws IOException
     */
    static void readObject(JsonReader in)
            throws IOException {
        in.beginObject();
        readJson(in);
        in.endObject();
    }

    /**
     * 解析整个json数据
     *
     * @param in json数据
     *
     * @throws IOException
     */
    private static void readJson(JsonReader in)
            throws IOException {
        while (in.hasNext()) {
            if (in.peek() == JsonToken.BEGIN_ARRAY) {
                readArray(in);
            } else if (in.peek() == JsonToken.NUMBER) {
                in.nextDouble();
            } else if (in.peek() == JsonToken.STRING) {
                in.nextString();
            } else if (in.peek() == JsonToken.NULL) {
                in.nextNull();
            } else if (in.peek() == JsonToken.NAME) {
                in.nextName();
            } else if (in.peek() == JsonToken.BOOLEAN) {
                in.nextBoolean();
            } else if (in.peek() == JsonToken.BEGIN_OBJECT) {
                readObject(in);
            }
        }
    }

    /**
     * @param type 0(int.class, Integer.class ) 1(short.class, Short.class) 2(long.class,
     * Long.class) 3(double.class, Double.class) 4(float.class, Float.class)
     *
     * @return
     */
    public static TypeAdapter<Number> longAdapter(final int type) {

        return new TypeAdapter<Number>() {

            @Override
            public Number read(JsonReader in)
                    throws IOException {
                boolean isNot = false;
                if (in.peek() == JsonToken.NULL) {
                    in.nextNull();
                    isNot = true;
                } else if (in.peek() == JsonToken.BEGIN_OBJECT) {
                    //增加判断是错误OBJECT的类型（应该是Number）,移动in的下标到结束，移动下标的代码在下方
                    GsonTools.readObject(in);
                    isNot = true;
                } else if (in.peek() == JsonToken.NAME) {
                    //增加判断是错误的name的类型（应该是Number）,移动in的下标到结束，移动下标的代码在下方
                    in.nextName();
                    isNot = true;
                } else if (in.peek() == JsonToken.BOOLEAN) {
                    //增加判断是错误的boolean的类型（应该是Number）,移动in的下标到结束，移动下标的代码在下方
                    in.nextBoolean();
                    isNot = true;
                } else if (in.peek() == JsonToken.BEGIN_ARRAY) {
                    //增加判断是错误的array的类型（应该是Number）,移动in的下标到结束，移动下标的代码在下方
                    readArray(in);
                    isNot = true;
                }
                if (isNot) {
                    switch (type) {
                        case 0:
                            return 0;
                        case 1:
                            return (short) 0;
                        case 2:
                            return 0;
                        case 3:
                            return (double) 0;
                        case 4:
                            return (float) 0;
                        default:
                            return 0;
                    }
                }
                try {
                    switch (type) {
                        case 0:
                            if (in.peek() == JsonToken.STRING) {
                                //暂不做处理
                                return StringUtils.toInt(in.nextString());
                            }
                            return in.nextInt();
                        case 1:
                            if (in.peek() == JsonToken.STRING) {
                                //暂不做处理
                                return StringUtils.toInt(in.nextString()).shortValue();
                            }
                            return (short) in.nextInt();
                        case 2:
                            if (in.peek() == JsonToken.STRING) {
                                //暂不做处理
                                return StringUtils.toLong(in.nextString()).longValue();
                            }
                            return in.nextLong();
                        case 3:
                            if (in.peek() == JsonToken.STRING) {
                                //暂不做处理
                                return StringUtils.toDouble(in.nextString()).doubleValue();
                            }
                            return in.nextDouble();
                        case 4:
                            if (in.peek() == JsonToken.STRING) {
                                //暂不做处理
                                return StringUtils.toFloat(in.nextString()).floatValue();
                            }
                            return (float) in.nextDouble();
                    }
                    return in.nextLong();
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException(e);
                }
            }

            @Override
            public void write(JsonWriter out, Number value)
                    throws IOException {
                if (value == null) {
                    out.nullValue();
                    return;
                }
                out.value(value.toString());
            }
        };
    }

    /**
     * 处理字符的适配器
     */
    public static TypeAdapter<String> stringTypeAdapter() {

        return new TypeAdapter<String>() {

            @Override
            public String read(JsonReader in)
                    throws IOException {
                JsonToken peek = in.peek();
                if (peek == JsonToken.NULL) {
                    in.nextNull();
                    return "";
                }
                if (peek == JsonToken.BOOLEAN) {
                    return Boolean.toString(in.nextBoolean());
                }
                if (in.peek() == JsonToken.BEGIN_OBJECT) {
                    GsonTools.readObject(in);
                    return "";
                }
                //增加判断是错误的name的类型（应该是object）,移动in的下标到结束，移动下标的代码在下方
                if (in.peek() == JsonToken.NAME) {
                    in.nextName();
                    return "";
                }
                //增加判断是错误的ARRAY的类型（应该是object）,移动in的下标到结束，移动下标的代码在下方
                if (in.peek() == JsonToken.BEGIN_ARRAY) {
                    GsonTools.readArray(in);
                    return "";
                }

                return in.nextString();
            }

            @Override
            public void write(JsonWriter out, String value)
                    throws IOException {
                out.value(value);
            }
        };
    }

    public static String errorTrack(JsonReader in, String type) {
        StackTraceElement[] stackTrace = Looper.getMainLooper()
                                               .getThread()
                                               .getStackTrace();
        StringBuilder stringBuilder = new StringBuilder();
        for (StackTraceElement element : stackTrace) {
            stringBuilder.append(element.getClassName() + "." + element
                    .getMethodName() + "(" + element
                    .getLineNumber() + ")\n");
        }
        try {
            stringBuilder.append("Expected a " + type + " but was " + in.peek() + " path " + in
                    .getPath());
            return stringBuilder.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }


}
