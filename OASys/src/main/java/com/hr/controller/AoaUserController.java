package com.hr.controller;

import com.alibaba.druid.sql.visitor.functions.If;
import com.hr.entity.AoaSysMenu;
import com.hr.entity.AoaUser;
import com.hr.service.IAoaSysMenuService;
import com.hr.service.IAoaUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("usermanage")
public class AoaUserController {

    @Autowired //用户
    private IAoaUserService iAoaUserService;

    @Autowired //权限
    private IAoaSysMenuService iAoaSysMenuService;

    @RequestMapping("queryAoaUserByNameAndPwd")
    public String queryAoaUserByNameAndPwd(String userName, String password, ModelMap map){
        AoaUser user = iAoaUserService.queryAoaUserByNameAndPwd(userName, password);
        if(user != null){
            map.addAttribute("user",user);
            //查询权限
            List<AoaSysMenu> alllist = iAoaSysMenuService.querySysMenuByRoleId(user.getRoleId(), null);
            List<AoaSysMenu> childlist = getSortData(alllist, new ArrayList<AoaSysMenu>(), 0L);
            List<AoaSysMenu> parentlist = iAoaSysMenuService.querySysMenuByRoleId(user.getRoleId(), 0L);
            map.addAttribute("childlist", childlist);
            map.addAttribute("parentlist", parentlist);
            return "index";
        }else{
            return "redirect:../login.html";
        }
    }

    public List<AoaSysMenu> getSortData(List<AoaSysMenu> list, List<AoaSysMenu> list2, Long pid){
        for (AoaSysMenu menu : list) {
            if (menu.getParentId().equals(pid)){
                if (menu.getMenuId() != 0){
                    list2.add(menu);
                }
                if (menu.getChildCount() > 0) {
                    getSortData(list, list2, menu.getMenuId());
                }
            }
        }
        return list2;
    }

}
