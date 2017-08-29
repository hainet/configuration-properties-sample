package com.hainet.configuration.properties.sample;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
@Data
public class Config {

    private String stringValue;

    private int intValue;

    private boolean booleanValue;

    private String layer;

    private NestedConfig nestedConfig;

    private String undefinedString;

    private int undefinedInt;

    private boolean undefinedBoolean;
}
