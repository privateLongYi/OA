package com.hr.controller;

import com.hr.entity.AoaTaskList;
import com.hr.entity.AoaUser;
import com.hr.mapper.AoaTaskListMapper;
import com.hr.service.IAoaTaskListService;
import com.hr.service.IAoaUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("taskList")
public class AoaTaskListController {

    @Autowired
    private IAoaUserService iAoaUserService;

    @Autowired
    private IAoaTaskListService iAoaTaskListService;

    @RequestMapping("tz")
    public String tz(){
        return "/taskmanage/taskmanage/taskmanage";
    }



    /**
     * //查询发布任务
     * @param page
     * @param count
     * @param keyword
     * @param taskPushUserId
     * @return
     */
    @RequestMapping("queryTask")
    @ResponseBody
    public List<AoaTaskList> queryTask(Integer page, Integer count, String keyword,Long taskPushUserId){

        return iAoaTaskListService.queryTask(page*count,count,keyword,taskPushUserId);

    }
    /**
     * 根据条件查询总条数
     * @param keyword
     * @return
     */
    @RequestMapping("queryTaskByword")
    @ResponseBody
    public Integer queryTaskByword(String keyword){
        return iAoaTaskListService.queryTaskByword(keyword);
    }

    /**
     * 单值查询需要修改的数据
     * @param map
     * @param taskId
     * @return
     */
    @RequestMapping("goUpdate")
    public String goUpdate(ModelMap map,Long taskId){
        AoaTaskList taskList = iAoaTaskListService.goUpdate(taskId);

        map.addAttribute("taskList",taskList);

        return "/taskmanage/taskmanage/taskedit";

    }
    /**
     * 根据ID修改发布任务
     * @param map
     * @param taskList
     * @return
     */
    @RequestMapping("updTaskList")
    public String updTaskList(ModelMap map, AoaTaskList taskList){
        iAoaTaskListService.updTaskList(taskList);
        //System.out.println(taskList.getTaskId()+"+"+taskList.getTypeId()+"+"+taskList.getTitle()+"+"+taskList.getTaskDescribe()+"+"+taskList.getIsTop()+"+"+taskList.getIsCancel());
        return "/taskmanage/taskmanage/taskmanage";
    }

    /**
     * 根据ID删除发布任务
     * @param taskId
     * @return
     */
    @RequestMapping("delTaskList")
    public String delTaskList(Long taskId){
        iAoaTaskListService.delTaskList(taskId);
        return "/taskmanage/taskmanage/taskmanage";
    }

    /**
     * 新增一条发布任务
     * @param taskList
     * @return
     */
    @RequestMapping("saveTaskList")
    public String saveTaskList(AoaTaskList taskList){
        iAoaTaskListService.saveTaskList(taskList);
        return "/taskmanage/taskmanage/taskmanage";
    }

    //接收人的选择
    @RequestMapping("queryUser")
    public List<AoaUser> queryUser(ModelMap map, Long deptId, Long roleId){
        List<AoaUser> list = iAoaUserService.queryUser(deptId,roleId);
        map.addAttribute("list",list);

    }



}
