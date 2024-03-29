package com.hr.controller;

import com.hr.entity.AoaSysMenu;
import com.hr.service.IAoaSysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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

    /**
     * 查询所有父级系统菜单
     * @param map
     * @return
     */
    @RequestMapping("goSave")
    public String goSave(ModelMap map, Integer menuId){
        List<AoaSysMenu> list =  iAoaSysMenuService.queryParentSysMenu();
        map.addAttribute("list", list);
        map.addAttribute("menuId",menuId);
        return "/sysmanage/menumanage/menuadd";
    }

    /**
     * 增加系统菜单
     * @param sysMenu
     * @return
     */
    @RequestMapping("saveAoaSysMenu")
    public String saveAoaSysMenu(AoaSysMenu sysMenu){
        iAoaSysMenuService.saveAoaSysMenu(sysMenu);
        return "/sysmanage/menumanage/menumanage";
    }

    /**
     * 根据ID删除系统菜单
     * @param menuId
     * @return
     */
    @RequestMapping("delSysMenuById")
    public String delSysMenuById(Long menuId){
        iAoaSysMenuService.delSysMenuById(menuId);
        return "/sysmanage/menumanage/menumanage";
    }

    /**
     * 根据ID查询系统菜单
     * @param map
     * @param menuId
     * @return
     */
    @RequestMapping("querySysMenuById")
    public String querySysMenuById(ModelMap map, Long menuId){
        AoaSysMenu sysMenu =  iAoaSysMenuService.querySysMenuById(menuId);
        List<AoaSysMenu> list =  iAoaSysMenuService.queryParentSysMenu();
        map.addAttribute("list", list);
        map.addAttribute("sysMenu", sysMenu);
        return "/sysmanage/menumanage/menuedit";
    }

    /**
     * 根据ID修改系统菜单
     * @param sysMenu
     * @return
     */
    @RequestMapping("updSysMenuById")
    public String updSysMenuById(AoaSysMenu sysMenu){
        iAoaSysMenuService.updSysMenuById(sysMenu);
        return "/sysmanage/menumanage/menumanage";
    }

}
