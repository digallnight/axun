package com.lqp.axun.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "axun_diary")
public class AxunDiary {
    @Id
    @Column(name = "diary_id")
    private String diaryId;

    @Column(name = "diary_title")
    private String diaryTitle;

    @Column(name = "crt_user_id")
    private String crtUserId;

    @Column(name = "crt_time")
    private Date crtTime;

    /**
     * @return diary_id
     */
    public String getDiaryId() {
        return diaryId;
    }

    /**
     * @param diaryId
     */
    public void setDiaryId(String diaryId) {
        this.diaryId = diaryId == null ? null : diaryId.trim();
    }

    /**
     * @return diary_title
     */
    public String getDiaryTitle() {
        return diaryTitle;
    }

    /**
     * @param diaryTitle
     */
    public void setDiaryTitle(String diaryTitle) {
        this.diaryTitle = diaryTitle == null ? null : diaryTitle.trim();
    }

    /**
     * @return crt_user_id
     */
    public String getCrtUserId() {
        return crtUserId;
    }

    /**
     * @param crtUserId
     */
    public void setCrtUserId(String crtUserId) {
        this.crtUserId = crtUserId == null ? null : crtUserId.trim();
    }

    /**
     * @return crt_time
     */
    public Date getCrtTime() {
        return crtTime;
    }

    /**
     * @param crtTime
     */
    public void setCrtTime(Date crtTime) {
        this.crtTime = crtTime;
    }
}