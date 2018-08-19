package com.lqp.axun.base.bean;

import com.lqp.axun.util.DateUtil;
import com.lqp.axun.util.StringUtil;

public class PgInHeader {
    private String requestTime;

    private String requester;

    private String ip;

    private int pageNo;

    private int pageCount;

    public PgInHeader() {
        if (StringUtil.isNull(requestTime)) {
            this.requestTime = DateUtil.now();
        }
    }
}
