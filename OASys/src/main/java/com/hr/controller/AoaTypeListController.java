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

    @RequestMapping("queryTypeListByModelOrName")
    @ResponseBody
    public List<AoaTypeList> queryTypeListByModelOrName(Integer page, Integer count, String keyword){
        return iAoaTypeListService.queryTypeListByModelOrName(page*count, count, keyword);
    }

    @RequestMapping("queryTotalByModelOrName")
    @ResponseBody
    public Integer queryTotalByModelOrName(String keyword){
        return iAoaTypeListService.queryTotalByModelOrName(keyword);
    }

}
