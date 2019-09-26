package com.hr.mapper;

import com.hr.entity.AoaSysMenu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AoaSysMenuMapper {

    //根据角色ID查询所有权限
    List<AoaSysMenu> querySysMenuByRoleId(@Param("roleId") Long roleId,
                                          @Param("parentId") Long parentId);

    //根据条件分页查询权限
    List<AoaSysMenu> querySysMenuByName(Integer page, Integer count, String keyword);

    //根据条件查询总页数
    Integer queryTotalByName(String keyword);

}