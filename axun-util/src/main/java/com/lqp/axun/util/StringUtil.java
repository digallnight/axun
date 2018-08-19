package com.lqp.axun.util;

/**
 * 字符串相关公共类
 */
public class StringUtil {

    /**
     * 判断字符串是否为null或长度为0
     *
     * @param str
     * @return true/false
     */
    public static boolean isNull(String str) {
        if (str == null) {
            return true;
        } else {
            if (str.isEmpty()) {
                return true;
            } else {
                return false;
            }
        }
    }
}
