package com.vknyazeva.spring.rest.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("com.vknyazeva.spring.rest")
public class MyConfig {

    @Bean // бин исп-ся для осуществления http request
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
