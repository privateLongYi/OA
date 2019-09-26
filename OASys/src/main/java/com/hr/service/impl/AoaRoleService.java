package com.hr.service.impl;

import com.hr.entity.AoaRole;
import com.hr.entity.AoaSysMenu;
import com.hr.mapper.AoaRoleMapper;
import com.hr.service.IAoaRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AoaRoleService implements IAoaRoleService {

    @Autowired
    private AoaRoleMapper aoaRoleMapper;

    @Override
    public List<AoaRole> queryAoaRole(Integer page, Integer count, String keyword) {
        return aoaRoleMapper.queryAoaRole(page,count,keyword);
    }

    @Override
    public Integer queryAoaRoleTotal(String keyword) {
        return aoaRoleMapper.queryAoaRoleTotal(keyword);
    }

    @Override
    public void saveAoaTypeList(AoaRole aoaRole) {
        aoaRoleMapper.saveAoaTypeList(aoaRole);
    }

    @Override
    public void delTypeListByRoleId(Long roleId) {
        aoaRoleMapper.delTypeListByRoleId(roleId);
    }

    @Override
    public List<AoaSysMenu> queryRoleByRoleId(Long roleId) {
        return aoaRoleMapper.queryRoleByRoleId(roleId);
    }
}
