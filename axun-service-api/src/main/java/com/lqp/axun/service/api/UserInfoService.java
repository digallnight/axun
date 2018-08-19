package com.lqp.axun.service.api;

import com.lqp.axun.service.in.UserInfoGetIn;
import com.lqp.axun.service.in.UserInfoInsertIn;
import com.lqp.axun.service.out.UserInfo;
import com.lqp.axun.service.out.UserInfoGetOut;
import com.lqp.axun.service.out.UserInfoInsertOut;
import com.lqp.axun.service.out.UserInfoList;

public interface UserInfoService {

    public UserInfoInsertOut userInfoInert(UserInfoInsertIn in);

    public UserInfoGetOut userInfoGet(UserInfoGetIn in);

    public UserInfo getUserById(String userId);

    public UserInfoList getUsersByField();
}
