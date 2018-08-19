package com.lqp.axun.base.bean;

import com.lqp.axun.util.DateUtil;
import com.lqp.axun.util.StringUtil;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OutHeader {
    private String responseTime;

    private String errorCode;

    private String errorInfo;

    public OutHeader() {
        if (StringUtil.isNull(responseTime)) {
            this.responseTime = DateUtil.now();
        }
    }
}
