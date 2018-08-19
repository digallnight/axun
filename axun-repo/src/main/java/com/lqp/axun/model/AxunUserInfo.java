package com.lqp.axun.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "axun_user_info")
public class AxunUserInfo {
    @Id
    @Column(name = "user_id")
    private String userId;

    @Column(name = "user_name")
    private String userName;

    private String passwd;

    private String mobile;

    private String email;

    @Column(name = "time_crt")
    private Date timeCrt;

    @Column(name = "time_upd")
    private Date timeUpd;

    /**
     * @return user_id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * @return passwd
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * @param passwd
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * @return time_crt
     */
    public Date getTimeCrt() {
        return timeCrt;
    }

    /**
     * @param timeCrt
     */
    public void setTimeCrt(Date timeCrt) {
        this.timeCrt = timeCrt;
    }

    /**
     * @return time_upd
     */
    public Date getTimeUpd() {
        return timeUpd;
    }

    /**
     * @param timeUpd
     */
    public void setTimeUpd(Date timeUpd) {
        this.timeUpd = timeUpd;
    }
}