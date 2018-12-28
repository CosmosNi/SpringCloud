package com.cosmos.feign.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Cosmos
 * @program: cosmos-cloud-tutorial
 * @Description:
 * @Date: Create in 2018-12-17 15:05
 * @Modified By：
 */
@Configuration
public class HelloFeignServiceConfig {

    /**
     * looger.level具体级别如下
     *      NONE:不记录任何信息
     *      BASIC:仅记录请求方法，URL以及响应状态码和执行时间
     *      HEADERS:除了记录BASIC级别信息外，还会记录请求和响应的头信息
     *      FULL: 记录所有请求和响应的明细，包括头信息，清求体，元数据
     * @return
     */
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
