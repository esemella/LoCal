package com.spork;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationConfiguration {

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate(new SimpleClientHttpRequestFactory());
    }
}
