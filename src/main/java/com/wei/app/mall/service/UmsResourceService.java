package com.wei.app.mall.service;

import com.github.pagehelper.PageInfo;
import com.wei.app.mall.model.UmsResource;

public interface UmsResourceService {

    PageInfo<UmsResource> page(Integer pageNum, Integer pageSize, Long categoryId);
}
