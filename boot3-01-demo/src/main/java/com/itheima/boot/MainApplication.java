package com.itheima.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(MainApplication.class, args);
        //获取容器中所有组件名字
        String[] beanDefinitionNames = ioc.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }
}
