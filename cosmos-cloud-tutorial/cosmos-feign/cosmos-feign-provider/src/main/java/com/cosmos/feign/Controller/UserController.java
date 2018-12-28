package com.cosmos.feign.Controller;

import com.cosmos.feign.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Cosmos
 * @program: cosmos-cloud-tutorial
 * @Description: TODO（描述此类的用法）
 * @Date: Create in 2018-12-17 20:56
 * @Modified By：
 */
@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping("/add")
    public String addUser(User user) {
        return "add:" + user.toString();
    }

    @PostMapping("/update")
    public String updateUser(User user) {
        return "update:" + user.toString();
    }
}
