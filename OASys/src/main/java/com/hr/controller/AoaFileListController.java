package com.hr.controller;

import com.hr.entity.AoaFileList;
import com.hr.service.IAoaFileListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("fileList")
public class AoaFileListController {

//    @Autowired
//    private IAoaFileListService iAoaFileListService;
//
//    @RequestMapping("queryAll")
//    public List<AoaFileList> queryAll(ModelMap map){
//        List<AoaFileList> list = iAoaFileListService.queryAll();
//        map.addAttribute("list",list);
//        return list;
//    }
}
