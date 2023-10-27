package com.wei.app.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.wei.app.mall.mbg.mapper", "com.wei.app.mall.dao"})
public class MyBatisConfig {
}
