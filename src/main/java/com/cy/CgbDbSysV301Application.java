package com.cy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableCaching  // 启动缓存配置
@EnableAsync    // 启动异步配置
@SpringBootApplication
public class CgbDbSysV301Application {

    public static void main(String[] args) {
        SpringApplication.run(CgbDbSysV301Application.class, args);
    }

}
