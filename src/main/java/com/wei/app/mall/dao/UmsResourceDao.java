package com.wei.app.mall.dao;

import com.wei.app.mall.domain.UmsResourceExt;
import com.wei.app.mall.model.UmsResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UmsResourceDao {
    /**
     * 根据资源ID获取资源及分类信息
     */
    UmsResourceExt selectResourceWithCategory(Long id);

    /**
     * 根据资源ID获取资源及分类信息
     */
    UmsResourceExt selectResourceWithCategory2(Long id);

    /**
     * 根据分类ID查询资源
     */
    List<UmsResource> selectListByCategoryId(Long categoryId);
}

