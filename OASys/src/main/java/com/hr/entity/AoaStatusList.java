package com.hr.entity;

import java.io.Serializable;

public class AoaStatusList implements Serializable{
    private Long statusId;

    private String statusColor;

    private String statusModel;

    private String statusName;

    private Integer sortValue;

    private String sortPrecent;

    public AoaStatusList() {
    }

    public AoaStatusList(Long statusId, String statusColor, String statusModel, String statusName, Integer sortValue, String sortPrecent) {
        this.statusId = statusId;
        this.statusColor = statusColor;
        this.statusModel = statusModel;
        this.statusName = statusName;
        this.sortValue = sortValue;
        this.sortPrecent = sortPrecent;
    }

    @Override
    public String toString() {
        return "AoaStatusList{" +
                "statusId=" + statusId +
                ", statusColor='" + statusColor + '\'' +
                ", statusModel='" + statusModel + '\'' +
                ", statusName='" + statusName + '\'' +
                ", sortValue=" + sortValue +
                ", sortPrecent='" + sortPrecent + '\'' +
                '}';
    }

    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    public String getStatusColor() {
        return statusColor;
    }

    public void setStatusColor(String statusColor) {
        this.statusColor = statusColor == null ? null : statusColor.trim();
    }

    public String getStatusModel() {
        return statusModel;
    }

    public void setStatusModel(String statusModel) {
        this.statusModel = statusModel == null ? null : statusModel.trim();
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName == null ? null : statusName.trim();
    }

    public Integer getSortValue() {
        return sortValue;
    }

    public void setSortValue(Integer sortValue) {
        this.sortValue = sortValue;
    }

    public String getSortPrecent() {
        return sortPrecent;
    }

    public void setSortPrecent(String sortPrecent) {
        this.sortPrecent = sortPrecent == null ? null : sortPrecent.trim();
    }
}