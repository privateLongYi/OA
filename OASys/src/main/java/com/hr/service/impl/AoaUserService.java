package com.hr.service.impl;

import com.hr.entity.AoaUser;
import com.hr.mapper.AoaUserMapper;
import com.hr.service.IAoaUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class AoaUserService implements IAoaUserService {

    @Autowired
    private AoaUserMapper aoaUserMapper;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public AoaUser queryAoaUserByNameAndPwd(String userName, String password) {
        return aoaUserMapper.queryAoaUserByNameAndPwd(userName, password);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<AoaUser> queryUser(Long deptId, Long roleId) {
        return aoaUserMapper.queryUser(deptId, roleId);
    }
}
