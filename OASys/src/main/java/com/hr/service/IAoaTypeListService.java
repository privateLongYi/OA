package com.hr.service;

import com.hr.entity.AoaTypeList;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IAoaTypeListService {

    //根据模块或者类型分页查询系统类型表
    List<AoaTypeList> queryTypeListByModelOrName(@Param("page") Integer page,
                                                 @Param("count") Integer count,
                                                 @Param("keyword") String keyword);

    //根据条件查询总页数
    Integer queryTotalByModelOrName(String keyword);

    //新增类型
    void saveAoaTypeList(AoaTypeList typeList);

    //删除类型
    void delTypeListByTypeId(Long typeId);

    //根据ID查询类型
    AoaTypeList queryTypeListByTypeId(Long typeId);

    //根据ID修改类型
    void updTypeListByTypeId(AoaTypeList typeList);

}
