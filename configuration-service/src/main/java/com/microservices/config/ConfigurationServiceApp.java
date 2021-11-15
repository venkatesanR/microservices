package com.microservices.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(exclude = UserDetailsServiceAutoConfiguration.class)
@EnableConfigServer
@EnableEurekaClient
public class ConfigurationServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(ConfigurationServiceApp.class, args);
    }
}
