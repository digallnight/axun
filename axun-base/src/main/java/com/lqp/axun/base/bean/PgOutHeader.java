package com.lqp.axun.base.bean;

import com.lqp.common.base.util.DateUtil;
import com.lqp.common.base.util.StringUtil;

public class PgOutHeader {
    private String responseTime;

    private String errorCode;

    private String errorInfo;

    private int totalPage;

    private int totalCount;

    private int pageNo;

    private int pageCount;

    public PgOutHeader() {
        if (StringUtil.isNull(responseTime)) {
            this.responseTime = DateUtil.now();
        }
    }
}
