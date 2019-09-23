package com.hr.controller;

import com.hr.entity.AoaTypeList;
import com.hr.service.IAoaTypeListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("typeList")
public class AoaTypeListController {

    @Autowired
    private IAoaTypeListService iAoaTypeListService;

    @RequestMapping("queryTypeListByModelOrName")
    public List<AoaTypeList> queryTypeListByModelOrName(ModelMap map, Integer page, Integer count, String keyword){
        List<AoaTypeList> list = iAoaTypeListService.queryTypeListByModelOrName(page, count, keyword);
        map.addAttribute("list",list);
        return list;
    }

}
