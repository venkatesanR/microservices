package com.microservices.licensing.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class LicenseConfiguration {
    private final Environment environment;

    public LicenseConfiguration(final Environment environment) {
        this.environment = environment;
    }
}
