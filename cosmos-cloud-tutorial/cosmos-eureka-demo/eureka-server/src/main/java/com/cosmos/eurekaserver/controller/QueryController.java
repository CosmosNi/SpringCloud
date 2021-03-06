package com.cosmos.eurekaserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EurekaClientConfigBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Cosmos
 * @program: config-server
 * @Description: TODO（描述此类的用法）
 * @Date: Create in 2018-12-16 10:16
 * @Modified By：
 */
@RestController
@RequestMapping("query")
public class QueryController {
    @Autowired
    EurekaClientConfigBean eurekaClientConfigBean;

    @GetMapping("/eureka-server")
    /**
     * 获取所有节点信息
     */
    public Object getEurekaServerUrl() {
        return eurekaClientConfigBean.getServiceUrl();
    }
}
