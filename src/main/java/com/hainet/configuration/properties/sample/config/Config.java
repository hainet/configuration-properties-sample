package com.hainet.configuration.properties.sample.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties
@Data
public class Config {

    private String stringValue;

    private int intValue;

    private boolean booleanValue;

    private String layer;

    private List<String> list;

    private NestedConfig nestedConfig;

    @Data
    public static class NestedConfig {
        private String nestedValue;
    }

    private DeepConfig deepConfig;

    @Data
    @ConfigurationProperties(prefix = "a.b.c")
    public static class DeepConfig {
        private String deepValue;
    }

    private RandomConfig randomConfig;

    @Data
    public static class RandomConfig {

        private String value;

        private int intValue;

        private int intValueLessThanTen;

        private int intValueInRange;

        private long longValue;

        private String uuid;
    }

    private String undefinedString;

    private int undefinedInt;

    private boolean undefinedBoolean;
}
