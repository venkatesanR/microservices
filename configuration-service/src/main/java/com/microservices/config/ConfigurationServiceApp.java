package com.microservices.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication(exclude = UserDetailsServiceAutoConfiguration.class)
@EnableConfigServer
public class ConfigurationServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(ConfigurationServiceApp.class, args);
    }
}
