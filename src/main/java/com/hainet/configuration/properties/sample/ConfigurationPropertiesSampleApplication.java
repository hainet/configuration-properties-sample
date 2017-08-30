package com.hainet.configuration.properties.sample;

import com.hainet.configuration.properties.sample.config.Config;
import com.hainet.configuration.properties.sample.config.DeepConfig;
import com.hainet.configuration.properties.sample.config.RandomConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigurationPropertiesSampleApplication implements CommandLineRunner {

    private Config config;
    private DeepConfig deepConfig;
    private RandomConfig randomConfig;

    @Autowired
    public ConfigurationPropertiesSampleApplication(
            Config config,
            DeepConfig deepConfig,
            RandomConfig randomConfig) {
        this.config = config;
        this.deepConfig = deepConfig;
        this.randomConfig = randomConfig;
    }

    public static void main(String[] args) {
        SpringApplication.run(ConfigurationPropertiesSampleApplication.class, args);
    }

    @Override
    public void run(String[] args) {
        // 1: no args
        // 2: --spring.config.location=classpath:layer-one.yml
        // 3: --spring.config.location=classpath:layer-one.yml,classpath:layer-two.yml
        // 4: --spring.config.location=classpath:layer-one.yml,classpath:layer-two.yml --spring.profiles.active=env
        System.out.println(config);
        System.out.println(deepConfig);

        // --spring.config.location=classpath:random.yml
        System.out.println(randomConfig);
    }
}
