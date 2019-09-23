package com.hr.service.impl;

import com.hr.entity.AoaRole;
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
}
