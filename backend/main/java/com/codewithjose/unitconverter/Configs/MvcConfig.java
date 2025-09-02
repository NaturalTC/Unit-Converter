package com.codewithjose.unitconverter.Configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer { // <-- Implement the interface

    @Override // <-- Add the Override annotation
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/length").setViewName("length");
        registry.addViewController("/temperature").setViewName("temperature");
        registry.addViewController("/weight").setViewName("weight");
    }
}