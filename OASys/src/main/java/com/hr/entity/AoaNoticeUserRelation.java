package com.hr.entity;

public class AoaNoticeUserRelation {
    private Long relatinId;

    private Integer isRead;

    private Long relatinNoticeId;

    private Long relatinUserId;

    public AoaNoticeUserRelation() {
    }

    public AoaNoticeUserRelation(Long relatinId, Integer isRead, Long relatinNoticeId, Long relatinUserId) {
        this.relatinId = relatinId;
        this.isRead = isRead;
        this.relatinNoticeId = relatinNoticeId;
        this.relatinUserId = relatinUserId;
    }

    public Long getRelatinId() {
        return relatinId;
    }

    public void setRelatinId(Long relatinId) {
        this.relatinId = relatinId;
    }

    public Integer getIsRead() {
        return isRead;
    }

    public void setIsRead(Integer isRead) {
        this.isRead = isRead;
    }

    public Long getRelatinNoticeId() {
        return relatinNoticeId;
    }

    public void setRelatinNoticeId(Long relatinNoticeId) {
        this.relatinNoticeId = relatinNoticeId;
    }

    public Long getRelatinUserId() {
        return relatinUserId;
    }

    public void setRelatinUserId(Long relatinUserId) {
        this.relatinUserId = relatinUserId;
    }

    @Override
    public String toString() {
        return "AoaNoticeUserRelation{" +
                "relatinId=" + relatinId +
                ", isRead=" + isRead +
                ", relatinNoticeId=" + relatinNoticeId +
                ", relatinUserId=" + relatinUserId +
                '}';
    }
}