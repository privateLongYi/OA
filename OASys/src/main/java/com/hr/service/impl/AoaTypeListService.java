package com.hr.service.impl;

import com.hr.entity.AoaTypeList;
import com.hr.mapper.AoaTypeListMapper;
import com.hr.service.IAoaTypeListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AoaTypeListService implements IAoaTypeListService {

    @Autowired
    private AoaTypeListMapper aoaTypeListMapper;

    @Override
    public List<com.hr.entity.AoaTypeList> queryTypeListByModelOrName(Integer page, Integer count, String keyword) {
        return aoaTypeListMapper.queryTypeListByModelOrName(page, count, keyword);
    }

    @Override
    public Integer queryTotalByModelOrName(String keyword) {
        return aoaTypeListMapper.queryTotalByModelOrName(keyword);
    }

    @Override
    public void saveAoaTypeList(AoaTypeList typeList) {
        aoaTypeListMapper.saveAoaTypeList(typeList);
    }

    @Override
    public void delTypeListByTypeId(Long typeId) {
        aoaTypeListMapper.delTypeListByTypeId(typeId);
    }

    @Override
    public AoaTypeList queryTypeListByTypeId(Long typeId) {
        return aoaTypeListMapper.queryTypeListByTypeId(typeId);
    }

    @Override
    public void updTypeListByTypeId(AoaTypeList typeList) {
        aoaTypeListMapper.updTypeListByTypeId(typeList);
    }
}
