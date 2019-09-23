package com.hr.entity;

import java.util.Date;

public class AoaMailnumber {
    private Long mailNumberId;

    private String mailAccount;

    private Date mailCreateTime;

    private String mailDes;

    private Long mailType;

    private String mailUserName;

    private String password;

    private Long status;

    private Long mailNumUserId;

    public AoaMailnumber() {
    }

    public AoaMailnumber(Long mailNumberId, String mailAccount, Date mailCreateTime, String mailDes,
                         Long mailType, String mailUserName, String password, Long status, Long mailNumUserId) {
        this.mailNumberId = mailNumberId;
        this.mailAccount = mailAccount;
        this.mailCreateTime = mailCreateTime;
        this.mailDes = mailDes;
        this.mailType = mailType;
        this.mailUserName = mailUserName;
        this.password = password;
        this.status = status;
        this.mailNumUserId = mailNumUserId;
    }

    public Long getMailNumberId() {
        return mailNumberId;
    }

    public void setMailNumberId(Long mailNumberId) {
        this.mailNumberId = mailNumberId;
    }

    public String getMailAccount() {
        return mailAccount;
    }

    public void setMailAccount(String mailAccount) {
        this.mailAccount = mailAccount == null ? null : mailAccount.trim();
    }

    public Date getMailCreateTime() {
        return mailCreateTime;
    }

    public void setMailCreateTime(Date mailCreateTime) {
        this.mailCreateTime = mailCreateTime;
    }

    public String getMailDes() {
        return mailDes;
    }

    public void setMailDes(String mailDes) {
        this.mailDes = mailDes == null ? null : mailDes.trim();
    }

    public Long getMailType() {
        return mailType;
    }

    public void setMailType(Long mailType) {
        this.mailType = mailType;
    }

    public String getMailUserName() {
        return mailUserName;
    }

    public void setMailUserName(String mailUserName) {
        this.mailUserName = mailUserName == null ? null : mailUserName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getMailNumUserId() {
        return mailNumUserId;
    }

    public void setMailNumUserId(Long mailNumUserId) {
        this.mailNumUserId = mailNumUserId;
    }

    @Override
    public String toString() {
        return "AoaMailnumber{" +
                "mailNumberId=" + mailNumberId +
                ", mailAccount='" + mailAccount + '\'' +
                ", mailCreateTime=" + mailCreateTime +
                ", mailDes='" + mailDes + '\'' +
                ", mailType=" + mailType +
                ", mailUserName='" + mailUserName + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                ", mailNumUserId=" + mailNumUserId +
                '}';
    }
}