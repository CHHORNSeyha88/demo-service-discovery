package org.homework.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.config.CorsRegistry;

/**
 * Developed by ChhornSeyha
 * Date: 10/09/2025
 */

public class WebMvcConfigurer {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/v3/api-docs/**")
                        .allowedOrigins("*"); // Or restrict to your frontend URL
            }
        };
    }
}
