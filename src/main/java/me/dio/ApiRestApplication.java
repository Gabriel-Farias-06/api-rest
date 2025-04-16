package me.dio;

import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.*;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@OpenAPIDefinition(servers = { @Server(url = "/", description = "Default Server")})
@SpringBootApplication
public class ApiRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestApplication.class, args);
	}

}
