package com.hr.service.impl;


import com.hr.entity.AoaTaskList;
import com.hr.mapper.AoaTaskListMapper;
import com.hr.service.IAoaTaskListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AoaTaskListService implements IAoaTaskListService{
    @Autowired
    private AoaTaskListMapper aoaTaskListMapper;

    //新建任务
    @Override
    public void addTask(AoaTaskList aoaTaskList) {

    }
    //查询任务的发表

    @Override
    public List<AoaTaskList> queryTask(Integer page, Integer count, String keyword, Long taskPushUserId) {
        return aoaTaskListMapper.queryTask(page,count,keyword,taskPushUserId);
    }

    //根据条件查询总页数
    @Override
    public Integer queryTaskByword(String keyword) {
        return aoaTaskListMapper.queryTaskByword(keyword);
    }

    //单值查询需要修改的数据
    @Override
    public AoaTaskList goUpdate(Long taskId) {
        return aoaTaskListMapper.goUpdate(taskId);
    }

    @Override
    public void updTaskList(AoaTaskList taskList) {
        aoaTaskListMapper.updTaskList(taskList);
    }

    @Override
    public void delTaskList(long taskId) {
        aoaTaskListMapper.delTaskList(taskId);
    }

    @Override
    public void saveTaskList(AoaTaskList taskList) {
        aoaTaskListMapper.saveTaskList(taskList);
    }
}
