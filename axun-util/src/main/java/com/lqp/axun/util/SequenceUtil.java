package com.lqp.axun.util;

public class SequenceUtil {

    private static long ID_FLAG = 1260000000000L;
    protected static int SERVER_ID = 1;

    public static long nextId() throws Exception {
        System.out.println(System.currentTimeMillis());
        long id = System.currentTimeMillis() - ID_FLAG;
        System.out.println(id);
        id = (id << 7) | SERVER_ID;
        Thread.sleep(1);
        return id;
    }
}
