package com.lqp.axun.base.dict;

import java.util.HashMap;
import java.util.Map;

/**
 * 正则表达式定义
 *
 * @Auther: xxiao
 * @Date: 2018/8/21 23:42
 * @Description:
 */
public enum EnumRegx {
    CHECK_INT("^-?\\d+$", "校验是整数"),
    CHECK_BANK_ACC("^\\d{16,19}$", "校验银行卡号长度为16位到19位"),
    CHECK_AMT("^\\d{1,16}(\\.\\d{1,2})?$", "校验金额长度和小数位"),
    CHECK_MOBILE("/^1[0-9]{10}$/","校验是1开头的11位数字的手机号"),
    CHECK_MOBILE_T("/^1(3[0-9]|5[189]|8[6789])[0-9]{8}$/","校验中国通用合法手机号格式"),
    CHECK_EMAIL("^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.[a-zA-Z0-9]{2,6}$","校验电子邮箱格式"),
    ;
    private String code;
    private String desc;

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setMessage(String desc) {
        this.desc = desc;
    }

    EnumRegx(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static EnumRegx getByKey(String code) {
        if (code == null || "".equals(code.trim())) {
            return null;
        }
        for (EnumRegx type : values()) {
            if (type.getCode().equals(code))
                return type;
        }
        return null;
    }

    public static Map<String, String> toMap() {
        Map<String, String> enumDataMap = new HashMap<String, String>();
        for (EnumRegx key : values()) {
            enumDataMap.put(key.getCode(), key.getDesc());
        }
        return enumDataMap;
    }
}
