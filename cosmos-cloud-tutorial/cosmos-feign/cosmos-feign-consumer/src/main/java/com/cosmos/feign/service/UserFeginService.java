package com.cosmos.feign.service;

import com.cosmos.feign.pojo.User;
import com.cosmos.feign.service.fallback.UserFeignServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: Cosmos
 * @program: cosmos-cloud-tutorial
 * @Description: TODO（描述此类的用法）
 * @Date: Create in 2018-12-17 20:42
 * @Modified By：
 */
@FeignClient(name="feign-provider",fallback = UserFeignServiceFallback.class)
public interface UserFeginService {

    @GetMapping("/user/add")
    public String addUser(User user);

    @PostMapping("/user/update")
    public String updateUser(@RequestBody User user);

    @PostMapping(value = "/uploadFile/server",
            produces = {MediaType.APPLICATION_JSON_UTF8_VALUE},
            consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public String fileUpload(@RequestPart(value = "file") MultipartFile file);
}
