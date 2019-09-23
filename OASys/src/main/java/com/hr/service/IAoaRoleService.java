package com.hr.service;

import com.hr.entity.AoaRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IAoaRoleService {

    List<AoaRole> queryAoaRole(@Param("page") Integer page,
                               @Param("count") Integer count,
                               @Param("keyword") String keyword);

}
