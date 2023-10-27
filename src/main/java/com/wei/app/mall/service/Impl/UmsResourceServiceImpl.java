package com.wei.app.mall.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wei.app.mall.dao.UmsResourceDao;
import com.wei.app.mall.model.UmsResource;
import com.wei.app.mall.service.UmsResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UmsResourceServiceImpl implements UmsResourceService {

    @Autowired
    private UmsResourceDao umsResourceDao;

    @Override
    public PageInfo<UmsResource> page(Integer pageNum, Integer pageSize, Long categoryId) {
        PageHelper.startPage(pageNum,pageSize);
        List<UmsResource> resourceList = umsResourceDao.selectListByCategoryId(categoryId);
        PageInfo<UmsResource> pageInfo = new PageInfo<>(resourceList);
        return pageInfo;
    }
}