package com.hr.entity;

public class AoaRolePowerList {
    private Long pkId;

    private Integer isShow;

    private Long menuId;

    private Long roleId;

    public AoaRolePowerList() {
    }

    public AoaRolePowerList(Long pkId, Integer isShow, Long menuId, Long roleId) {
        this.pkId = pkId;
        this.isShow = isShow;
        this.menuId = menuId;
        this.roleId = roleId;
    }

    public Long getPkId() {
        return pkId;
    }

    public void setPkId(Long pkId) {
        this.pkId = pkId;
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "AoaRolePowerList{" +
                "pkId=" + pkId +
                ", isShow=" + isShow +
                ", menuId=" + menuId +
                ", roleId=" + roleId +
                '}';
    }
}