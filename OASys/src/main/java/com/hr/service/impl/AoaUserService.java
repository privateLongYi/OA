package com.hr.service.impl;

import com.hr.entity.AoaUser;
import com.hr.mapper.AoaUserMapper;
import com.hr.service.IAoaUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AoaUserService implements IAoaUserService {

    @Autowired
    private AoaUserMapper aoaUserMapper;

    @Override
    public AoaUser queryAoaUserByNameAndPwd(String userName, String password) {
        return aoaUserMapper.queryAoaUserByNameAndPwd(userName, password);
    }

    @Override
    public List<AoaUser> queryUser(Long deptId, Long roleId) {
        return aoaUserMapper.queryUser(deptId, roleId);
    }
}
