package com.demo.spring.server;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.PropertySource;

/**
 * @author luyankun
 * @description:
 * @createDate 2018-12-13
 */
@Slf4j
@EnableEurekaServer
@SpringBootApplication
@PropertySource(value = {"classpath:config/application.yml", "classpath:config/application-${spring.profiles.active}.yml"})
public class ApplicationStarter extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ApplicationStarter.class);
    }

    public static void main(String[] args) {
        log.info("启动spring boot服务中....");
        SpringApplication.run(ApplicationStarter.class, args);
        log.info("启动spring boot服务成功....");
    }
}
