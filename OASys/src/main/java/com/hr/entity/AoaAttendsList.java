package com.hr.entity;

import java.util.Date;

public class AoaAttendsList {
    private Long attendsId;

    private String attendsIp;

    private String attendsRemark;

    private Date attendsTime;

    private Long statusId;

    private Long typeId;

    private Long attendsUserId;

    private String attendHmtime;

    private String weekOfday;

    private Double holidayDays;

    private Date holidayStart;

    public AoaAttendsList() {
    }

    public AoaAttendsList(Long attendsId, String attendsIp,
                          String attendsRemark, Date attendsTime,
                          Long statusId, Long typeId, Long attendsUserId,
                          String attendHmtime, String weekOfday,
                          Double holidayDays, Date holidayStart) {
        this.attendsId = attendsId;
        this.attendsIp = attendsIp;
        this.attendsRemark = attendsRemark;
        this.attendsTime = attendsTime;
        this.statusId = statusId;
        this.typeId = typeId;
        this.attendsUserId = attendsUserId;
        this.attendHmtime = attendHmtime;
        this.weekOfday = weekOfday;
        this.holidayDays = holidayDays;
        this.holidayStart = holidayStart;
    }

    public Long getAttendsId() {
        return attendsId;
    }

    public void setAttendsId(Long attendsId) {
        this.attendsId = attendsId;
    }

    public String getAttendsIp() {
        return attendsIp;
    }

    public void setAttendsIp(String attendsIp) {
        this.attendsIp = attendsIp == null ? null : attendsIp.trim();
    }

    public String getAttendsRemark() {
        return attendsRemark;
    }

    public void setAttendsRemark(String attendsRemark) {
        this.attendsRemark = attendsRemark == null ? null : attendsRemark.trim();
    }

    public Date getAttendsTime() {
        return attendsTime;
    }

    public void setAttendsTime(Date attendsTime) {
        this.attendsTime = attendsTime;
    }

    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public Long getAttendsUserId() {
        return attendsUserId;
    }

    public void setAttendsUserId(Long attendsUserId) {
        this.attendsUserId = attendsUserId;
    }

    public String getAttendHmtime() {
        return attendHmtime;
    }

    public void setAttendHmtime(String attendHmtime) {
        this.attendHmtime = attendHmtime == null ? null : attendHmtime.trim();
    }

    public String getWeekOfday() {
        return weekOfday;
    }

    public void setWeekOfday(String weekOfday) {
        this.weekOfday = weekOfday == null ? null : weekOfday.trim();
    }

    public Double getHolidayDays() {
        return holidayDays;
    }

    public void setHolidayDays(Double holidayDays) {
        this.holidayDays = holidayDays;
    }

    public Date getHolidayStart() {
        return holidayStart;
    }

    public void setHolidayStart(Date holidayStart) {
        this.holidayStart = holidayStart;
    }

    @Override
    public String toString() {
        return "AoaAttendsList{" +
                "attendsId=" + attendsId +
                ", attendsIp='" + attendsIp + '\'' +
                ", attendsRemark='" + attendsRemark + '\'' +
                ", attendsTime=" + attendsTime +
                ", statusId=" + statusId +
                ", typeId=" + typeId +
                ", attendsUserId=" + attendsUserId +
                ", attendHmtime='" + attendHmtime + '\'' +
                ", weekOfday='" + weekOfday + '\'' +
                ", holidayDays=" + holidayDays +
                ", holidayStart=" + holidayStart +
                '}';
    }
}