package org.homework;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@OpenAPIDefinition(
        info = @Info(title = "USER API",version = "v1",description = "create user"),
        servers = {
                @Server(url = "/")
        }
)
public class UserServiceApplication {
    public static void main(String[] args) {
       SpringApplication.run(UserServiceApplication.class,args);
    }
}