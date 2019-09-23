package com.hr.entity;

import java.util.Date;

public class AoaInMailList {
    private Long mailId;

    private Date mailCreateTime;

    private Long mailFileId;

    private String mailTitle;

    private Long mailType;

    private Long mailInPushUserId;

    private String inReceiver;

    private Long mailStatusId;

    private Long mailNumberId;

    private Integer mailDel;

    private Integer mailPush;

    private Integer mailStar;

    private String mailContent;

    public AoaInMailList() {
    }

    public AoaInMailList(Long mailId, Date mailCreateTime, Long mailFileId, String mailTitle, Long mailType, Long mailInPushUserId, String inReceiver,
                         Long mailStatusId, Long mailNumberId, Integer mailDel, Integer mailPush, Integer mailStar, String mailContent) {
        this.mailId = mailId;
        this.mailCreateTime = mailCreateTime;
        this.mailFileId = mailFileId;
        this.mailTitle = mailTitle;
        this.mailType = mailType;
        this.mailInPushUserId = mailInPushUserId;
        this.inReceiver = inReceiver;
        this.mailStatusId = mailStatusId;
        this.mailNumberId = mailNumberId;
        this.mailDel = mailDel;
        this.mailPush = mailPush;
        this.mailStar = mailStar;
        this.mailContent = mailContent;
    }

    public Long getMailId() {
        return mailId;
    }

    public void setMailId(Long mailId) {
        this.mailId = mailId;
    }

    public Date getMailCreateTime() {
        return mailCreateTime;
    }

    public void setMailCreateTime(Date mailCreateTime) {
        this.mailCreateTime = mailCreateTime;
    }

    public Long getMailFileId() {
        return mailFileId;
    }

    public void setMailFileId(Long mailFileId) {
        this.mailFileId = mailFileId;
    }

    public String getMailTitle() {
        return mailTitle;
    }

    public void setMailTitle(String mailTitle) {
        this.mailTitle = mailTitle == null ? null : mailTitle.trim();
    }

    public Long getMailType() {
        return mailType;
    }

    public void setMailType(Long mailType) {
        this.mailType = mailType;
    }

    public Long getMailInPushUserId() {
        return mailInPushUserId;
    }

    public void setMailInPushUserId(Long mailInPushUserId) {
        this.mailInPushUserId = mailInPushUserId;
    }

    public String getInReceiver() {
        return inReceiver;
    }

    public void setInReceiver(String inReceiver) {
        this.inReceiver = inReceiver == null ? null : inReceiver.trim();
    }

    public Long getMailStatusId() {
        return mailStatusId;
    }

    public void setMailStatusId(Long mailStatusId) {
        this.mailStatusId = mailStatusId;
    }

    public Long getMailNumberId() {
        return mailNumberId;
    }

    public void setMailNumberId(Long mailNumberId) {
        this.mailNumberId = mailNumberId;
    }

    public Integer getMailDel() {
        return mailDel;
    }

    public void setMailDel(Integer mailDel) {
        this.mailDel = mailDel;
    }

    public Integer getMailPush() {
        return mailPush;
    }

    public void setMailPush(Integer mailPush) {
        this.mailPush = mailPush;
    }

    public Integer getMailStar() {
        return mailStar;
    }

    public void setMailStar(Integer mailStar) {
        this.mailStar = mailStar;
    }

    public String getMailContent() {
        return mailContent;
    }

    public void setMailContent(String mailContent) {
        this.mailContent = mailContent == null ? null : mailContent.trim();
    }

    @Override
    public String toString() {
        return "AoaInMailList{" +
                "mailId=" + mailId +
                ", mailCreateTime=" + mailCreateTime +
                ", mailFileId=" + mailFileId +
                ", mailTitle='" + mailTitle + '\'' +
                ", mailType=" + mailType +
                ", mailInPushUserId=" + mailInPushUserId +
                ", inReceiver='" + inReceiver + '\'' +
                ", mailStatusId=" + mailStatusId +
                ", mailNumberId=" + mailNumberId +
                ", mailDel=" + mailDel +
                ", mailPush=" + mailPush +
                ", mailStar=" + mailStar +
                ", mailContent='" + mailContent + '\'' +
                '}';
    }
}