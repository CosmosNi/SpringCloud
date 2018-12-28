package com.cosmos.feign.service.fallback;

import com.cosmos.feign.pojo.User;
import com.cosmos.feign.service.UserFeginService;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: Cosmos
 * @program: cosmos-cloud-tutorial
 * @Description: TODO（描述此类的用法）
 * @Date: Create in 2018-12-17 21:35
 * @Modified By：
 */
@Component
public class UserFeignServiceFallback implements UserFeginService
{
    public String addUser(User user) {
        return "当前服务出现问题";
    }

    public String updateUser(User user) {
        return "当前服务出现问题";
    }

    public String fileUpload(MultipartFile file) {
        return "当前服务出现问题";
    }
}
