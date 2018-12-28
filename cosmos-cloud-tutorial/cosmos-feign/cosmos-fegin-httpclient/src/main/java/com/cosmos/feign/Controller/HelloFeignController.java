package com.cosmos.feign.Controller;

import com.cosmos.feign.service.HelloFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Cosmos
 * @program: cosmos-cloud-tutorial
 * @Description: TODO（描述此类的用法）
 * @Date: Create in 2018-12-17 15:09
 * @Modified By：
 */
@RestController
public class HelloFeignController {
    @Autowired
    private HelloFeignService helloFeignService;

    @GetMapping("/search/github")
    public String getGithubInfo(@RequestParam("str") String querystr) {
        return helloFeignService.searchRepo(querystr);

    }
}
