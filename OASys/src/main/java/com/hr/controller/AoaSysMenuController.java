package com.hr.controller;

import com.hr.service.IAoaSysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("sysMenu")
public class AoaSysMenuController {

    @Autowired
    private IAoaSysMenuService iAoaSysMenuService;

    @RequestMapping("tz")
    public String tz(){
        return "/sysmanage/menumanage/menumanage";
    }

}
