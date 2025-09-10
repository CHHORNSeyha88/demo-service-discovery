package org.homework.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Developed by ChhornSeyha
 * Date: 10/09/2025
 */

@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi userApi(){
        return GroupedOpenApi.builder()
                .group("user-service")
                .pathsToMatch("api/v1/users/**")
                .build();
    }

    @Bean
    public GroupedOpenApi productApi() {
        return GroupedOpenApi.builder()
                .group("product-service")
                .pathsToMatch("api/v1/products/**")
                .build();
    }
}
