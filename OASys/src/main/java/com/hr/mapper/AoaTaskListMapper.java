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

    //根据条件查询总页数
    public Integer queryTaskByword(String keyword);

    //单值查询需要修改的数据
    public AoaTaskList goUpdate(@Param("taskId") Long taskId);

    //根据ID修改发布任务
    public void updTaskList(AoaTaskList taskList);

    //根据ID删除发布任务
    public void delTaskList(Long taskId);

    //新增一条发布任务
    public void saveTaskList(AoaTaskList taskList);



}