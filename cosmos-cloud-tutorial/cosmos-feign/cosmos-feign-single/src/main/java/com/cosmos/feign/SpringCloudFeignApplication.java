package com.cosmos.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: Cosmos
 * @program: cosmos-cloud-tutorial
 * @Description: TODO（描述此类的用法）
 * @Date: Create in 2018-12-17 15:01
 * @Modified By：
 */
@SpringBootApplication
@EnableFeignClients
public class SpringCloudFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudFeignApplication.class, args);

    }
}
