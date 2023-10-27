package com.wei.app.mall.domain;

import com.wei.app.mall.model.UmsResource;
import com.wei.app.mall.model.UmsResourceCategory;
import lombok.Data;

import java.util.List;
@Data
public class UmsResourceCategoryExt extends UmsResourceCategory{

    private List<UmsResource> resourceList;
}
