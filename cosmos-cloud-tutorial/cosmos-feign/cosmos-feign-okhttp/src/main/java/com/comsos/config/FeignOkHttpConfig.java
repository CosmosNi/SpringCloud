package com.comsos.config;

import feign.Feign;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * @Author: Cosmos
 * @program: cosmos-cloud-tutorial
 * @Description: TODO（描述此类的用法）
 * @Date: Create in 2018-12-17 16:13
 * @Modified By：
 */
@Configuration
@ConditionalOnClass(Feign.class)
@AutoConfigureBefore(FeignAutoConfiguration.class)
public class FeignOkHttpConfig {
    @Bean
    public OkHttpClient okHttpClient(){
        return new OkHttpClient().newBuilder()
                    //设置连接超时
                    .connectTimeout(60, TimeUnit.SECONDS)
                    //设置读超时
                    .readTimeout(60, TimeUnit.SECONDS)
                    //设置写超时
                    .writeTimeout(60,TimeUnit.SECONDS)
                    //是否自动重连
                    .retryOnConnectionFailure(true)
                    //
                    .connectionPool(new ConnectionPool())
                    .build();
    }

}
