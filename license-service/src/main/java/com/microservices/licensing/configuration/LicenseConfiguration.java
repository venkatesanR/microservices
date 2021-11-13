package com.microservices.licensing.configuration;

import org.springframework.cloud.config.environment.Environment;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LicenseConfiguration {
    private final Environment environment;

    public LicenseConfiguration(final Environment environment) {
        this.environment = environment;
    }
}
