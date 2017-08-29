package com.hainet.configuration.properties.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigurationPropertiesSampleApplication implements CommandLineRunner {

    private Config config;
    private DeepConfig deepConfig;

    @Autowired
    public ConfigurationPropertiesSampleApplication(
            Config config,
            DeepConfig deepConfig) {
        this.config = config;
        this.deepConfig = deepConfig;
    }

    public static void main(String[] args) {
        // 1: no args
        // 2: --spring.config.location=classpath:layer-one.yml
        // 3: --spring.config.location=classpath:layer-one.yml,classpath:layer-two.yml
        // 4: --spring.config.location=classpath:layer-one.yml,classpath:layer-two.yml --spring.profiles.active=env
        SpringApplication.run(ConfigurationPropertiesSampleApplication.class, args);
    }

    @Override
    public void run(String[] args) {
        System.out.println(config);
        System.out.println(deepConfig);
    }
}
