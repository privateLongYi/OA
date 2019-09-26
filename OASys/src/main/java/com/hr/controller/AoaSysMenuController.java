package com.hr.controller;

import com.hr.entity.AoaSysMenu;
import com.hr.service.IAoaSysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("sysMenu")
public class AoaSysMenuController {

    @Autowired
    private IAoaSysMenuService iAoaSysMenuService;

    @RequestMapping("tz")
    public String tz(){
        return "/sysmanage/menumanage/menumanage";
    }

    @RequestMapping("querySysMenuParent")
    @ResponseBody
    public List<AoaSysMenu> querySysMenuParent(){
        return iAoaSysMenuService.querySysMenuByRoleId(null, 0L);
    }

    @RequestMapping("querySysMenuByParentId")
    @ResponseBody
    public List<AoaSysMenu> querySysMenuByParentId(Long parentId){
        return iAoaSysMenuService.querySysMenuByRoleId(null, parentId);
    }

    /**
     * 分页查询
     * @param page
     * @param count
     * @param keyword
     * @return
     */
    @RequestMapping("querySysMenuByName")
    @ResponseBody
    public List<AoaSysMenu> querySysMenuByName(Integer page, Integer count, String keyword){
        return iAoaSysMenuService.querySysMenuByName(page*count, count, keyword);
    }

    /**
     * 根据条件查询总条数
     * @param keyword
     * @return
     */
    @RequestMapping("queryTotalByName")
    @ResponseBody
    public Integer queryTotalByName(String keyword){
        return iAoaSysMenuService.queryTotalByName(keyword);
    }

}
