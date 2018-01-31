package com.chemanman.lib_mgson.util;

import java.util.ArrayList;
import java.util.List;

import android.text.TextUtils;


/**
 * 字符串转换，使用包装类
 * Created by zhangzhang on 16/1/21.
 */
public class StringUtils {

    public static int String2Int(String data) {
        int result = -1;

        try {
            result = Integer.valueOf(data);
        } catch (Exception e) {
            // TODO
        }

        return result;
    }

    /**
     * 整形转换
     *
     * @param data 输入
     * @return Integer
     */
    public static Integer toInt(String data) {
        Integer result = 0;

        try {
            result = Integer.valueOf(data);
        } catch (Exception e) {
            // TODO
        }

        return result;
    }

    /**
     * Long转换
     *
     * @param data 输入
     * @return Long
     */
    public static Long toLong(String data) {
        Long result = 0L;

        try {
            result = Long.valueOf(data);
        } catch (Exception e) {
            // TODO
        }

        return result;
    }

    /**
     * 浮点转换
     *
     * @param data 输入
     * @return Float
     */
    public static Float toFloat(String data) {
        Float result = 0.0f;

        if (data != null && data.length() > 0) {
            try {
                result = Float.valueOf(data);
            } catch (Exception e) {
                // TODO
            }
        }

        return result;
    }

    /**
     * 浮点转换
     *
     * @param data 输入
     * @return Double
     */
    public static Double toDouble(String data) {
        Double result = 0.0;

        try {
            result = Double.valueOf(data);
        } catch (Exception e) {
            // TODO
        }

        return result;
    }

    /**
     * 判断是否是有效的值，0和0.0均视为false
     *
     * @param data 输入
     * @return boolean
     */
    public static boolean isEmpty(String data) {
        String tmp = (data != null ? data.replaceAll(" ", "") : "");

        if (TextUtils.isEmpty(tmp)) {
            return true;
        } else {
            try {
                return Double.valueOf(tmp) < 0.00001;
            } catch (Exception e) {
                return false;
            }
        }
    }

    /**
     * 字符串截取
     *
     * @param in  原始数据
     * @param max 最大文字截取尺寸
     */
    public static String subString(String in, int max) {
        float j = 0;  // 半角数目
        int offset = 0;

        if (max == -1) max = Integer.MAX_VALUE;

        if (in != null && max > 0) {
            for (offset = 0; offset < in.codePointCount(0, in.length()); offset++) {
                int c = in.codePointAt(offset);

                if (j > max) {
                    break;
                } else {
                    if (c > 32 && c <= 127) {
                        j += 0.5;
                    } else if (c == 10 || c == 13) {
                        break;
                    } else {
                        j += 1;
                    }
                }
            }
        }

        if (in != null) {
            offset = offset > in.length() ? in.length() : offset;
            return in.substring(0, offset);
        } else {
            return "";
        }
    }

    /**
     * 字符串截取
     *
     * @param in           原始数据
     * @param maxLine      做多行数
     * @param eachLineSize 每行字数
     */
    public static String[] subString(String in, int maxLine, int eachLineSize) {
        String inputString = in;
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < maxLine; i++) {
            String tmp = subString(inputString, eachLineSize);

            if (i == maxLine - 1 && i > 0) {
                tmp += ".";
            }

            arrayList.add(tmp);

            inputString = inputString.substring(Math.min(inputString.length(), tmp.length()),
                                                inputString.length());
            if (inputString.startsWith("\r\n")) {
                inputString = inputString.substring(2, inputString.length());
            } else if (inputString.startsWith("\r")) {
                inputString = inputString.substring(1, inputString.length());
            } else if (inputString.startsWith("\n")) {
                inputString = inputString.substring(1, inputString.length());
            }

            if (inputString.length() == 0) {
                break;
            }
        }

        String[] ret = new String[arrayList.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = arrayList.get(i);
        }

        return ret;
    }

    public static String getString(String s) {
        if (TextUtils.isEmpty(s)) {
            return "";
        }
        return s;
    }


    public static String listToString(List<String> stringList) {
        StringBuilder content = new StringBuilder();
        if (stringList != null && stringList.size() > 0) {
            for (int i = 0; i < stringList.size(); i++) {
                if (!TextUtils.isEmpty(stringList.get(i))) {
                    content.append(stringList.get(i));
                    content.append(",");
                }
            }
        } else {
            return "";
        }
        return content.toString().length() > 0 ? content.toString().substring(0, content.length() - 1) : "";
    }
}
