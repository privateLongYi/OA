package com.hr.controller;

import com.hr.entity.AoaUser;
import com.hr.service.IAoaUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("taskList")
public class AoaTaskListController {

    @Autowired
    private IAoaUserService iAoaUserService;

    //接收人的选择
    @RequestMapping("queryUser")
    public List<AoaUser> queryUser(ModelMap map, Long deptId, Long roleId){
        List<AoaUser> list = iAoaUserService.queryUser(deptId,roleId);
        map.addAttribute("list",list);
        return list;
    }

}
