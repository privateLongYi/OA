package com.hr.entity;

import java.io.Serializable;

public class AoaSysMenu implements Serializable{
    private Long menuId;

    private Integer isShow;

    private Integer menuGrade;

    private String menuIcon;

    private String menuName;

    private String menuUrl;

    private Long parentId;

    private Integer sortId;

    //角色ID
    private Long roleId;

    //角色名称
    private String roleName;

    //子级数量
    private Integer childCount;

    @Override
    public String toString() {
        return "AoaSysMenu{" +
                "menuId=" + menuId +
                ", isShow=" + isShow +
                ", menuGrade=" + menuGrade +
                ", menuIcon='" + menuIcon + '\'' +
                ", menuName='" + menuName + '\'' +
                ", menuUrl='" + menuUrl + '\'' +
                ", parentId=" + parentId +
                ", sortId=" + sortId +
                ", roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", childCount=" + childCount +
                '}';
    }

    public AoaSysMenu() {
    }

    public AoaSysMenu(Long menuId, Integer isShow, Integer menuGrade, String menuIcon,
                      String menuName, String menuUrl, Long parentId, Integer sortId) {
        this.menuId = menuId;
        this.isShow = isShow;
        this.menuGrade = menuGrade;
        this.menuIcon = menuIcon;
        this.menuName = menuName;
        this.menuUrl = menuUrl;
        this.parentId = parentId;
        this.sortId = sortId;
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
        this.roleName = roleName;
    }

    public Integer getChildCount() {
        return childCount;
    }

    public void setChildCount(Integer childCount) {
        this.childCount = childCount;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public Integer getMenuGrade() {
        return menuGrade;
    }

    public void setMenuGrade(Integer menuGrade) {
        this.menuGrade = menuGrade;
    }

    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon == null ? null : menuIcon.trim();
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null ? null : menuUrl.trim();
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }
}