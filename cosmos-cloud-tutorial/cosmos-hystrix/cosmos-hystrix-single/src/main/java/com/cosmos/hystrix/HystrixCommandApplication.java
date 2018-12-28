package com.cosmos.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @Author: Cosmos
 * @program: cosmos-cloud-tutorial
 * @Description: TODO（描述此类的用法）
 * @Date: Create in 2018-12-18 08:51
 * @Modified By：
 */
@SpringBootApplication
@EnableHystrix
public class HystrixCommandApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixCommandApplication.class,args);
    }
}
