package com.hr.entity;

public class AoaScheduleUser {
    private Long rcid;

    private Long userId;

    public AoaScheduleUser() {
    }

    public AoaScheduleUser(Long rcid, Long userId) {
        this.rcid = rcid;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "AoaScheduleUser{" +
                "rcid=" + rcid +
                ", userId=" + userId +
                '}';
    }

    public Long getRcid() {
        return rcid;
    }

    public void setRcid(Long rcid) {
        this.rcid = rcid;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}