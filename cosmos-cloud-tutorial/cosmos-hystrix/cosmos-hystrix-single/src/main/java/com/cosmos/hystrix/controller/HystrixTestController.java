package com.cosmos.hystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Cosmos
 * @program: cosmos-cloud-tutorial
 * @Description: TODO（描述此类的用法）
 * @Date: Create in 2018-12-18 08:52
 * @Modified By：
 */
@RestController
public class HystrixTestController {
    @GetMapping("/test")
    @HystrixCommand(fallbackMethod = "defaultTest")
    public String test(String name) throws Exception {
        if (name.equals("zhangsan")) {
            return "welcome," + name + "!";
        }
        throw new Exception("");
    }

    public String defaultTest(String name) {
        return "sorry,you can not";
    }
}
