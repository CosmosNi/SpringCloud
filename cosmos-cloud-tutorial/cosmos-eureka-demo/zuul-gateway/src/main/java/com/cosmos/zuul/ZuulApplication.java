package com.cosmos.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author: Cosmos
 * @program: cosmos-cloud-tutorial
 * @Description: TODO（描述此类的用法）
 * @Date: Create in 2018-12-16 21:29
 * @Modified By：
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ZuulApplication {
    public static void main(String[] args) {

        SpringApplication.run(ZuulApplication.class, args);
    }
}
