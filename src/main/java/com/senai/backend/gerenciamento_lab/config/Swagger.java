package com.senai.backend.gerenciamento_lab.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Gerenciamento de Laboratório de ",
        version = "1.0",
        description = "cesarricart@gmail.com"
    )
)
public class Swagger {

}