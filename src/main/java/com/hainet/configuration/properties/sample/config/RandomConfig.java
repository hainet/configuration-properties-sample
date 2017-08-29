package com.hainet.configuration.properties.sample.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "some")
@Data
public class RandomConfig {

    private String value;

    private int intValue;

    private int intValueLessThanTen;

    private int intValueInRange;

    private long longValue;

    private String uuid;
}
