package com.training.self;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages = "com.training.self", exclude = {DataSourceAutoConfiguration.class })
public class SelfApplication {

    public static void main(String[] args) {
        SpringApplication.run(SelfApplication.class, args);
    }

}
