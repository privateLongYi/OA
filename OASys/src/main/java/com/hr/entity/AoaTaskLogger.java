package com.hr.entity;

import java.util.Date;

public class AoaTaskLogger {
    private Long loggerId;

    private Date createTime;

    private String loggerTicking;

    private Long taskId;

    private String username;

    private Integer loggerStatusid;

    public AoaTaskLogger() {
    }

    public AoaTaskLogger(Long loggerId, Date createTime, String loggerTicking, Long taskId, String username, Integer loggerStatusid) {
        this.loggerId = loggerId;
        this.createTime = createTime;
        this.loggerTicking = loggerTicking;
        this.taskId = taskId;
        this.username = username;
        this.loggerStatusid = loggerStatusid;
    }

    public Long getLoggerId() {
        return loggerId;
    }

    public void setLoggerId(Long loggerId) {
        this.loggerId = loggerId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLoggerTicking() {
        return loggerTicking;
    }

    public void setLoggerTicking(String loggerTicking) {
        this.loggerTicking = loggerTicking == null ? null : loggerTicking.trim();
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getLoggerStatusid() {
        return loggerStatusid;
    }

    public void setLoggerStatusid(Integer loggerStatusid) {
        this.loggerStatusid = loggerStatusid;
    }

    @Override
    public String toString() {
        return "AoaTaskLogger{" +
                "loggerId=" + loggerId +
                ", createTime=" + createTime +
                ", loggerTicking='" + loggerTicking + '\'' +
                ", taskId=" + taskId +
                ", username='" + username + '\'' +
                ", loggerStatusid=" + loggerStatusid +
                '}';
    }
}