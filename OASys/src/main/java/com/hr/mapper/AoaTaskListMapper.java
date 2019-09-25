package com.hr.mapper;


import com.hr.entity.AoaTaskList;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AoaTaskListMapper {
    //新建任务
    public void addTask(AoaTaskList aoaTaskList);

    //查询发布的任务
    public List<AoaTaskList> queryTask(@Param("page") Integer page,
                                       @Param("count") Integer count,
                                       @Param("keyword") String keyword,
                                       @Param("taskPushUserId") Long taskPushUserId);



}