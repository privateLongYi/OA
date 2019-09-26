package com.hr.mapper;

import com.hr.entity.AoaRole;

import java.util.List;

import com.hr.entity.AoaSysMenu;
import org.apache.ibatis.annotations.Param;

public interface AoaRoleMapper {


    /**
     * 查询角色列表
     * @param page
     * @param count
     * @param keyword
     * @return 返回所有角色
     */
    List<AoaRole> queryAoaRole(@Param("page") Integer page,
                               @Param("count") Integer count,
                               @Param("keyword") String keyword);

    /**
     * 条件查询总页数
     * @param keyword
     * @return 页数
     */
    Integer queryAoaRoleTotal(String keyword);

    /**
     * 添加角色
     * @param aoaRole
     */
    void saveAoaRole(AoaRole aoaRole);

    /**
     * 根据id删除
     * @param roleId
     */
    void delRoleByRoleId(Long roleId);

    /**
     *根据ID查询菜单权限
     * @param roleId
     * @return 返回菜单列表
     */
    List<AoaSysMenu> queryRoleByRoleId(Long roleId);

}