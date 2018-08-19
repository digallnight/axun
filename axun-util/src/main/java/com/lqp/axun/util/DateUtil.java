package com.lqp.axun.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static String now() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return df.format(new Date());
    }

    public static String now(String formatStr) {
        SimpleDateFormat df = new SimpleDateFormat(formatStr);
        return df.format(new Date());
    }
}
