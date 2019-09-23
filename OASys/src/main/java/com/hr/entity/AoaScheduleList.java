package com.hr.entity;

import java.util.Date;

public class AoaScheduleList {
    private Long rcId;

    private Date createTime;

    private Date endTime;

    private String filedescribe;

    private Integer isRemind;

    private Date startTime;

    private Long statusId;

    private String title;

    private Long typeId;

    private Long userId;

    private String miaoshu;

    private Integer isreminded;

    public AoaScheduleList() {
    }

    public AoaScheduleList(Long rcId, Date createTime, Date endTime, String filedescribe, Integer isRemind, Date startTime, Long statusId,
                           String title, Long typeId, Long userId, String miaoshu, Integer isreminded) {
        this.rcId = rcId;
        this.createTime = createTime;
        this.endTime = endTime;
        this.filedescribe = filedescribe;
        this.isRemind = isRemind;
        this.startTime = startTime;
        this.statusId = statusId;
        this.title = title;
        this.typeId = typeId;
        this.userId = userId;
        this.miaoshu = miaoshu;
        this.isreminded = isreminded;
    }

    public Long getRcId() {
        return rcId;
    }

    public void setRcId(Long rcId) {
        this.rcId = rcId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getFiledescribe() {
        return filedescribe;
    }

    public void setFiledescribe(String filedescribe) {
        this.filedescribe = filedescribe == null ? null : filedescribe.trim();
    }

    public Integer getIsRemind() {
        return isRemind;
    }

    public void setIsRemind(Integer isRemind) {
        this.isRemind = isRemind;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getMiaoshu() {
        return miaoshu;
    }

    public void setMiaoshu(String miaoshu) {
        this.miaoshu = miaoshu == null ? null : miaoshu.trim();
    }

    public Integer getIsreminded() {
        return isreminded;
    }

    public void setIsreminded(Integer isreminded) {
        this.isreminded = isreminded;
    }

    @Override
    public String toString() {
        return "AoaScheduleList{" +
                "rcId=" + rcId +
                ", createTime=" + createTime +
                ", endTime=" + endTime +
                ", filedescribe='" + filedescribe + '\'' +
                ", isRemind=" + isRemind +
                ", startTime=" + startTime +
                ", statusId=" + statusId +
                ", title='" + title + '\'' +
                ", typeId=" + typeId +
                ", userId=" + userId +
                ", miaoshu='" + miaoshu + '\'' +
                ", isreminded=" + isreminded +
                '}';
    }
}