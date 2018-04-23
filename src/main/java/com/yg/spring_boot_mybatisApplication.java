package com.yg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @MapperScan("com.kfit.*")
 * //这里和以往不一样的地方就是MapperScan的注解，这个是会扫描该包下的接口
 */
@SpringBootApplication
@MapperScan("com.yg.*")
public class spring_boot_mybatisApplication {
    public static void main(String args[]){
        SpringApplication.run(spring_boot_mybatisApplication.class,args);
    }
}
