package com.hr.service;

import com.hr.entity.AoaTypeList;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IAoaTypeListService {

    //根据模块或者类型分页查询系统类型表
    List<AoaTypeList> queryTypeListByModelOrName(@Param("page") Integer page,
                                                 @Param("count") Integer count,
                                                 @Param("keyword") String keyword);

}
