package com.hr.entity;

public class AoaMailReciver {
    private Long pkId;

    private Integer isRead;

    private Long mailId;

    private Long mailReciverId;

    private Integer isStar;

    private Integer isDel;

    public AoaMailReciver() {
    }

    public AoaMailReciver(Long pkId, Integer isRead, Long mailId, Long mailReciverId, Integer isStar, Integer isDel) {
        this.pkId = pkId;
        this.isRead = isRead;
        this.mailId = mailId;
        this.mailReciverId = mailReciverId;
        this.isStar = isStar;
        this.isDel = isDel;
    }

    public Long getPkId() {
        return pkId;
    }

    public void setPkId(Long pkId) {
        this.pkId = pkId;
    }

    public Integer getIsRead() {
        return isRead;
    }

    public void setIsRead(Integer isRead) {
        this.isRead = isRead;
    }

    public Long getMailId() {
        return mailId;
    }

    public void setMailId(Long mailId) {
        this.mailId = mailId;
    }

    public Long getMailReciverId() {
        return mailReciverId;
    }

    public void setMailReciverId(Long mailReciverId) {
        this.mailReciverId = mailReciverId;
    }

    public Integer getIsStar() {
        return isStar;
    }

    public void setIsStar(Integer isStar) {
        this.isStar = isStar;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
}