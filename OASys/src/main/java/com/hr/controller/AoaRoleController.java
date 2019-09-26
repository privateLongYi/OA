package com.hr.controller;


import com.hr.entity.AoaRole;
import com.hr.service.IAoaRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("role")
public class AoaRoleController {

    @Autowired
    private IAoaRoleService aoaRoleService;

    /**
     * 分页查询
     * @param page
     * @param count
     * @param keyword
     * @return 返回分页条查询
     */
    @RequestMapping("queryAoaRole")
    @ResponseBody
    public List<AoaRole> queryRole(Integer page, Integer count, String keyword){
        return aoaRoleService.queryAoaRole(page,count,keyword);
    }


    /**
     * 根据条件查询总条数
     * @param keyword
     * @return
     */
    @RequestMapping("queryAoaRoleTotal")
    @ResponseBody
    public Integer queryAoaRoleTotal(String keyword){
        return aoaRoleService.queryAoaRoleTotal(keyword);
    }




}
