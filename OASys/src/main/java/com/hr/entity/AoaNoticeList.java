package com.hr.entity;

import java.util.Date;

public class AoaNoticeList {
    private Long noticeId;

    private String content;

    private Integer isTop;

    private Date modifyTime;

    private Date noticeTime;

    private Long statusId;

    private String title;

    private Long typeId;

    private String url;

    private Long userId;

    public AoaNoticeList() {
    }

    public AoaNoticeList(Long noticeId, String content, Integer isTop, Date modifyTime,
                         Date noticeTime, Long statusId, String title, Long typeId, String url, Long userId) {
        this.noticeId = noticeId;
        this.content = content;
        this.isTop = isTop;
        this.modifyTime = modifyTime;
        this.noticeTime = noticeTime;
        this.statusId = statusId;
        this.title = title;
        this.typeId = typeId;
        this.url = url;
        this.userId = userId;
    }

    public Long getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Long noticeId) {
        this.noticeId = noticeId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getIsTop() {
        return isTop;
    }

    public void setIsTop(Integer isTop) {
        this.isTop = isTop;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Date getNoticeTime() {
        return noticeTime;
    }

    public void setNoticeTime(Date noticeTime) {
        this.noticeTime = noticeTime;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "AoaNoticeList{" +
                "noticeId=" + noticeId +
                ", content='" + content + '\'' +
                ", isTop=" + isTop +
                ", modifyTime=" + modifyTime +
                ", noticeTime=" + noticeTime +
                ", statusId=" + statusId +
                ", title='" + title + '\'' +
                ", typeId=" + typeId +
                ", url='" + url + '\'' +
                ", userId=" + userId +
                '}';
    }
}