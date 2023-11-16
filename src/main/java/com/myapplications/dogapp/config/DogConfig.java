package com.myapplications.dogapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DogConfig {

    @Bean
    public String appName() {
        return "${spring.application.name}";
    }

}
