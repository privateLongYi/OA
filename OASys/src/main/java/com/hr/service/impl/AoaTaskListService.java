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
}
