package ro.fasttrackit.curs13.homework.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@EnableEurekaClient
@SpringBootApplication
public class Curs13HomeworkApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(Curs13HomeworkApiGatewayApplication.class, args);
    }
}
