package com.hr.mapper;

import com.hr.entity.AoaSysMenu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AoaSysMenuMapper {

    //根据角色ID查询所有权限
    List<AoaSysMenu> querySysMenuByRoleId(@Param("roleId") Long roleId,
                                          @Param("parentId") Long parentId);

    //根据条件分页查询权限
    List<AoaSysMenu> querySysMenuByName(@Param("page") Integer page,
                                        @Param("count") Integer count,
                                        @Param("keyword") String keyword);

    //根据条件查询总页数
    Integer queryTotalByName(String keyword);

    //查询父级系统菜单
    List<AoaSysMenu> queryParentSysMenu();

    //增加系统菜单
    void saveAoaSysMenu(AoaSysMenu sysMenu);

    //根据ID删除系统菜单
    void delsysMenuById(Long menuId);

    //根据ID查询系统菜单
    AoaSysMenu querysysMenuById(Long menuId);

    //根据ID修改系统菜单
    void updsysMenuById(AoaSysMenu sysMenu);

}