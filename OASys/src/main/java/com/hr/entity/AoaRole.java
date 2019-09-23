package com.hr.entity;

public class AoaRole {
    private Long roleId;

    private String roleName;

    private Integer roleValue;

    public AoaRole() {
    }

    public AoaRole(Long roleId, String roleName, Integer roleValue) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.roleValue = roleValue;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public Integer getRoleValue() {
        return roleValue;
    }

    public void setRoleValue(Integer roleValue) {
        this.roleValue = roleValue;
    }

    @Override
    public String toString() {
        return "AoaRole{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", roleValue=" + roleValue +
                '}';
    }
}