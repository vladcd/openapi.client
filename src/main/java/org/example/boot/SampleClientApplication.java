package org.example.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@EnableFeignClients(basePackages = {"org.example"})
@ComponentScan(basePackages = {"org.example"})
public class SampleClientApplication {

    public static void main(final String[] args) {
        SpringApplication.run(SampleClientApplication.class, args);
    }
}