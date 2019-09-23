package com.hr.service;

import com.hr.entity.AoaSysMenu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IAoaSysMenuService {

    //根据角色ID查询所有权限
    List<AoaSysMenu> querySysMenuByRoleId(@Param("roleId") Long roleId,
                                          @Param("parentId") Long parentId);

}