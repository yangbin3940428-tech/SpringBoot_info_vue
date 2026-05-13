package com.zxjz.info;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yangbin
 */
@SpringBootApplication
@MapperScan("com.zxjz.info.mapper")
public class InfoApplication {
    public static void main(String[] args) {
        SpringApplication.run(InfoApplication.class, args);
    }
}
