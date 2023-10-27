package com.wei.app.mall.test;

import com.github.pagehelper.PageInfo;
import com.wei.app.mall.dao.UmsResourceCategoryDao;
import com.wei.app.mall.dao.UmsResourceDao;
import com.wei.app.mall.domain.UmsResourceCategoryExt;
import com.wei.app.mall.domain.UmsResourceExt;
import com.wei.app.mall.model.UmsResource;
import com.wei.app.mall.service.UmsResourceService;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyBatisAdvanceTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyBatisAdvanceTest.class);

    @Autowired
    private UmsResourceDao umsResourceDao;

    @Autowired
    private UmsResourceCategoryDao umsResourceCategoryDao;

    @Autowired
    private UmsResourceService umsResourceService;

    @Test
    void testOneToOne(){
        UmsResourceExt umsResourceExt = umsResourceDao.selectResourceWithCategory(1L);
        LOGGER.info("testOneToOne category={}",umsResourceExt.getCategory());
    }

    @Test
    void testAssociation(){
        UmsResourceExt umsResourceExt = umsResourceDao.selectResourceWithCategory2(1L);
        LOGGER.info("testAssociation category={}",umsResourceExt.getCategory());
    }

    @Test
    void testOneToMany(){
        UmsResourceCategoryExt umsResourceCategoryExt = umsResourceCategoryDao.selectCategoryWithResource(1L);
        LOGGER.info("testOneToMany resourceList={}",umsResourceCategoryExt.getResourceList());
    }

    @Test
    void testPage() {
        int pageNum = 1;
        int pageSize = 5;
        PageInfo<UmsResource> pageInfo = umsResourceService.page(pageNum, pageSize, 1L);
        LOGGER.info("testPage total={},pages={},resourceList={}", pageInfo.getTotal(), pageInfo.getPages(), pageInfo.getList());
    }
}
