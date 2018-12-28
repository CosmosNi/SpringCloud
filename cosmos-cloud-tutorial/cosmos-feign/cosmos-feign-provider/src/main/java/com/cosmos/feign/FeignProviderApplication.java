package com.cosmos.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: Cosmos
 * @program: cosmos-cloud-tutorial
 * @Description: TODO（描述此类的用法）
 * @Date: Create in 2018-12-17 20:54
 * @Modified By：
 */
@SpringBootApplication
@EnableEurekaClient
public class FeignProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignProviderApplication.class, args);
    }
}
