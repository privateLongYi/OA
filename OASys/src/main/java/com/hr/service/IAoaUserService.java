package com.hr.service;

import com.hr.entity.AoaUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IAoaUserService {

    //接收人的选择
    public List<AoaUser> queryUser(@Param("deptId") Long deptId,
                                   @Param("roleId") Long roleId);


    //根据用户名和密码查询可用用户
    AoaUser queryAoaUserByNameAndPwd(@Param("userName") String userName, @Param("password") String password);


}
