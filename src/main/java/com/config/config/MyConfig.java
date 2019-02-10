package com.config.config;

import com.config.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author li
 * 2019/1/20 11:56
 * version 1.0
 */
@Configuration
public class MyConfig {
    @Bean
    public HelloService helloService(){
        System.out.println("注入了容器组件");
        System.out.println();

        return new HelloService();
    }
}
