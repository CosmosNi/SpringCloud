package com.comsos.service;

import com.comsos.config.HelloFeignServiceConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: Cosmos
 * @program: cosmos-cloud-tutorial
 * @Description: TODO（描述此类的用法）
 * @Date: Create in 2018-12-17 15:03
 * @Modified By：
 */
@FeignClient(name = "github-client", url = "https://api.github.com", configuration = HelloFeignServiceConfig.class)
public interface HelloFeignService {

    @GetMapping(value = "/search/repositories")
    String searchRepo(@RequestParam("q") String queryStr);
}
