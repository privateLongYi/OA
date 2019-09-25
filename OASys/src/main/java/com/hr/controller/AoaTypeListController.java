package com.hr.controller;

import com.hr.entity.AoaTypeList;
import com.hr.service.IAoaTypeListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("typeList")
public class AoaTypeListController {

    @Autowired
    private IAoaTypeListService iAoaTypeListService;

    @RequestMapping("tz")
    public String tz(){
        return "/sysmanage/typemanage/typemanage";
    }

    /**
     * 分页查询
     * @param page
     * @param count
     * @param keyword
     * @return
     */
    @RequestMapping("queryTypeListByModelOrName")
    @ResponseBody
    public List<AoaTypeList> queryTypeListByModelOrName(Integer page, Integer count, String keyword){
        return iAoaTypeListService.queryTypeListByModelOrName(page*count, count, keyword);
    }

    /**
     * 根据条件查询总条数
     * @param keyword
     * @return
     */
    @RequestMapping("queryTotalByModelOrName")
    @ResponseBody
    public Integer queryTotalByModelOrName(String keyword){
        return iAoaTypeListService.queryTotalByModelOrName(keyword);
    }

    /**
     * 新增
     * @param typeList
     * @return
     */
    @RequestMapping("saveAoaTypeList")
    public String saveAoaTypeList(AoaTypeList typeList){
        iAoaTypeListService.saveAoaTypeList(typeList);
        return "/sysmanage/typemanage/typemanage";
    }

    /**
     * 删除
     * @param typeId
     * @return
     */
    @RequestMapping("delTypeListByTypeId")
    public String delTypeListByTypeId(Long typeId){
        iAoaTypeListService.delTypeListByTypeId(typeId);
        return "/sysmanage/typemanage/typemanage";
    }

    /**
     * 根据ID查询系统类型（去修改）
     * @param map
     * @param typeId
     * @return
     */
    @RequestMapping("goUpdate")
    public String goUpdate(ModelMap map, Long typeId){
        AoaTypeList typeList = iAoaTypeListService.queryTypeListByTypeId(typeId);
        map.addAttribute("typeList", typeList);
        return "/sysmanage/typemanage/typeedit";
    }

    /**
     * 根据ID修改系统类型
     * @param map
     * @param typeList
     * @return
     */
    @RequestMapping("updTypeListByTypeId")
    public String updTypeListByTypeId(ModelMap map, AoaTypeList typeList){
        iAoaTypeListService.updTypeListByTypeId(typeList);
        return "/sysmanage/typemanage/typemanage";
    }

}
