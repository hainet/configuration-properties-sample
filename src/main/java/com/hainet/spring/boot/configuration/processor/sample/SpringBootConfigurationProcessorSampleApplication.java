package com.hainet.spring.boot.configuration.processor.sample;

import com.hainet.spring.boot.configuration.processor.sample.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootConfigurationProcessorSampleApplication implements CommandLineRunner {

    private Config config;

    @Autowired
    public SpringBootConfigurationProcessorSampleApplication(Config config) {
        this.config = config;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootConfigurationProcessorSampleApplication.class, args);
    }

    @Override
    public void run(String[] args) {
        // no args
        // --spring.profiles.active=env
        // --spring.config.location=classpath:/layer-one.yml
        // --spring.config.location=classpath:/layer-one.yml,classpath:/layer-two.yml
        // --spring.config.location=classpath:/layer-one.yml,classpath:/layer-two.yml --spring.profiles.active=env
        // --spring.config.name=custom-name
        // --spring.config.name=custom-name --spring.profiles.active=env
        System.out.println(config);
    }
}
