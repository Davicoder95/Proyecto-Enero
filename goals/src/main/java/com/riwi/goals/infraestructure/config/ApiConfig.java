package com.riwi.goals.infraestructure.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;

@Configuration
@OpenAPIDefinition(info = @Info(
        title = "Goals",
        version = "1.0",
        description = "API"
),
        servers = {
                @Server(url = "http://localhost:8080", description = "Server local")
        }
)
public class ApiConfig {

    @Bean
    public OpenAPI customOpenApi() {
        return new OpenAPI(); // Configuración básica de Swagger
    }
}
