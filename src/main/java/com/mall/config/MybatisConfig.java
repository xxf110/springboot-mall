package com.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Administrator
 */

@Configuration
@MapperScan("com.mall.mbg.mapper")
public class MybatisConfig {
}
