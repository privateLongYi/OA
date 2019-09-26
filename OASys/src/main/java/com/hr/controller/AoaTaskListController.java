package com.hr.controller;

import com.hr.entity.AoaTaskList;
import com.hr.entity.AoaUser;
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



    //接收人的选择
    @RequestMapping("queryUser")
    public List<AoaUser> queryUser(ModelMap map, Long deptId, Long roleId){
        List<AoaUser> list = iAoaUserService.queryUser(deptId,roleId);
        map.addAttribute("list",list);
        return list;
    }

}
