package com.mystore.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Product tumbler() {
        return new Product("Tumbler", 150);
    }

    @Bean
    public Product bucket() {
        return new Product("Bucket", 300);
    }
}
