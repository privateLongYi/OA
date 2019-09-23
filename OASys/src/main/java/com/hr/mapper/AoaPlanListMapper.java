package com.hr.mapper;

import com.hr.entity.AoaPlanList;

import java.util.List;

public interface AoaPlanListMapper {

    public List<AoaPlanList> queryApaPlanList();

    public void AoaPlanListByID(int planId);

    public void delAoaPlanList(int planId);

    public void updAoaPlanList(int planId);
}