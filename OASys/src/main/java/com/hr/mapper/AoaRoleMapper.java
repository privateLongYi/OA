package com.hr.mapper;

import com.hr.entity.AoaRole;

import java.util.List;
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

}