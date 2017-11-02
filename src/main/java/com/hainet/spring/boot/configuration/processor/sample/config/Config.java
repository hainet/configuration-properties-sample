package com.hainet.spring.boot.configuration.processor.sample.config;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Component
@ConfigurationProperties
@Validated
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

    @NotEmpty
    private String notEmpty;

    private String undefinedString;

    private int undefinedInt;

    private boolean undefinedBoolean;
}
