package com.microservices.router.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RouterConfiguration {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public RouteLocator gatewayRoutes(final RouteLocatorBuilder builder) {
        return builder.routes()
                .route("r1", r -> r.path("/api/license")
                        .uri("lb://licensingservice"))
                .route("r2", r -> r.path("/api/organization")
                        .uri("lb://organizationservice"))
                .build();
    }
}
