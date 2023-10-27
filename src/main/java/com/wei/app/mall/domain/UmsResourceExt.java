package com.wei.app.mall.domain;

import com.wei.app.mall.model.UmsResource;
import com.wei.app.mall.model.UmsResourceCategory;
import lombok.Data;

@Data
public class UmsResourceExt extends UmsResource {

    private UmsResourceCategory category;
}
