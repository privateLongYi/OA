package com.hr.service.impl;

import com.hr.entity.AoaSysMenu;
import com.hr.mapper.AoaSysMenuMapper;
import com.hr.service.IAoaSysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class AoaSysMenuService implements IAoaSysMenuService {

    @Autowired
    private AoaSysMenuMapper aoaSysMenuMapper;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<AoaSysMenu> querySysMenuByRoleId(Long roleId, Long parentId) {
        return aoaSysMenuMapper.querySysMenuByRoleId(roleId, parentId);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<AoaSysMenu> querySysMenuByName(Integer page, Integer count, String keyword) {
        return aoaSysMenuMapper.querySysMenuByName(page, count, keyword);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Integer queryTotalByName(String keyword) {
        return aoaSysMenuMapper.queryTotalByName(keyword);
    }

    @Override
    public List<AoaSysMenu> queryParentSysMenu() {
        return aoaSysMenuMapper.queryParentSysMenu();
    }

    @Override
    public void saveAoaSysMenu(AoaSysMenu sysMenu) {
        aoaSysMenuMapper.saveAoaSysMenu(sysMenu);
    }

    @Override
    public void delsysMenuById(Long menuId) {
        aoaSysMenuMapper.delsysMenuById(menuId);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public AoaSysMenu querysysMenuById(Long menuId) {
        return aoaSysMenuMapper.querysysMenuById(menuId);
    }

    @Override
    public void updsysMenuById(AoaSysMenu sysMenu) {
        aoaSysMenuMapper.updsysMenuById(sysMenu);
    }
}
