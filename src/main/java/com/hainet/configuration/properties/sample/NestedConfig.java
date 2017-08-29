package com.hainet.configuration.properties.sample;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
@Data
public class NestedConfig {

    private String nestedValue;
}
