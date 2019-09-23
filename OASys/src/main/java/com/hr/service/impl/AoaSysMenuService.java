package com.hr.service.impl;

import com.hr.entity.AoaSysMenu;
import com.hr.mapper.AoaSysMenuMapper;
import com.hr.service.IAoaSysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AoaSysMenuService implements IAoaSysMenuService {

    @Autowired
    private AoaSysMenuMapper aoaSysMenuMapper;

    @Override
    public List<AoaSysMenu> querySysMenuByRoleId(Long roleId, Long parentId) {
        return aoaSysMenuMapper.querySysMenuByRoleId(roleId, parentId);
    }

}
