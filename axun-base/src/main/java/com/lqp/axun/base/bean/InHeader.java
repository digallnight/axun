package com.lqp.axun.base.bean;

import com.lqp.common.base.util.DateUtil;
import com.lqp.common.base.util.StringUtil;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class InHeader {
    private String requestTime;

    private String requester;

    private String ip;

    public InHeader() {
        if (StringUtil.isNull(requestTime)) {
            this.requestTime = DateUtil.now();
        }
    }
}
