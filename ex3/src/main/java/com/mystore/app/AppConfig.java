package com.mystore.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.mystore.app") // Ensure the correct package is scanned
public class AppConfig {

    @Bean
    public Barcode barcode() {
        return new Barcode();
    }

    @Bean
    public Product product(Barcode barcode) { // Pass Barcode as a dependency
        return new Product(barcode);
    }
}