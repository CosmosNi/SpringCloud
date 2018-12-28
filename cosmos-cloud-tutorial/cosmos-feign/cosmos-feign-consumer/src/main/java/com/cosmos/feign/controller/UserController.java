package com.cosmos.feign.controller;

import com.cosmos.feign.pojo.User;
import com.cosmos.feign.service.UserFeginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: Cosmos
 * @program: cosmos-cloud-tutorial
 * @Description: TODO（描述此类的用法）
 * @Date: Create in 2018-12-17 20:44
 * @Modified By：
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserFeginService userFeginService;

    @PostMapping("/add")
    public String addUser(@RequestBody User user){
        return userFeginService.addUser(user);
    }


    @PostMapping("/update")
    public String updateUser(@RequestBody User user){
        return userFeginService.updateUser(user);
    }

    @PostMapping(value = "/uploadFile/server",
            produces = {MediaType.APPLICATION_JSON_UTF8_VALUE},
            consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public String fileUpload(@RequestPart(value = "file") MultipartFile file){
        return userFeginService.fileUpload(file);
    }
}
