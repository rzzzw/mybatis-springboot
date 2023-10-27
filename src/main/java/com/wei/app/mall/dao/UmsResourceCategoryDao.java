package com.wei.app.mall.dao;

import com.wei.app.mall.domain.UmsResourceCategoryExt;
import org.springframework.stereotype.Repository;

@Repository
public interface UmsResourceCategoryDao {

    /**
     * 根据分类ID获取分类及对应资源
     */
    UmsResourceCategoryExt selectCategoryWithResource(Long id);
}
