package com.hainet.spring.boot.configuration.processor.sample.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:/property-source.properties")
public class PropertySourceConfig {

    private final Environment environment;

    @Autowired
    public PropertySourceConfig(final Environment environment) {
        this.environment = environment;
    }

    public String get(final String key) {
        return environment.getProperty(key);
    }
}
