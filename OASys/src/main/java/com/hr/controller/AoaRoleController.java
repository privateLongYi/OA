package com.hr.controller;


import com.hr.entity.AoaRole;
import com.hr.service.IAoaRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("role")
public class AoaRoleController {

    @Autowired
    private IAoaRoleService aoaRoleService;

    @RequestMapping("queryAoaRole")
    public String queryRole(ModelMap map, Integer page, Integer count, String keyword){

        List<AoaRole> roleList = aoaRoleService.queryAoaRole(page,count,keyword);

        map.put("roleLis",roleList);

        return "rolemanage";
    }

}
