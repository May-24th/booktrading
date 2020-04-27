package com.lh.booktrading;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = {"com.lh.booktrading.mybatis.mapper"})
@SpringBootApplication
public class BooktradingApplication {

    public static void main(String[] args) {
        SpringApplication.run(BooktradingApplication.class, args);
    }

}
