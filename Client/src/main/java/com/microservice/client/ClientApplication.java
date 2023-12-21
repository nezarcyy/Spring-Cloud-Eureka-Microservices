package com.microservice.client;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.microservice.client.models.Client;
import com.microservice.client.repositories.ClientRepository;

@EnableDiscoveryClient
@SpringBootApplication
public class ClientApplication {
	@Bean
	CommandLineRunner initialiserBaseH2(ClientRepository clientRepository) {
		return args -> {
			clientRepository.save(new Client(Long.parseLong("1"), "Rabab FAHSSI", Float.parseFloat("23")));
			clientRepository.save(new Client(Long.parseLong("2"), "Houda EL KORAINI", Float.parseFloat("22")));
			clientRepository.save(new Client(Long.parseLong("3"), "Saad BAKANZIZE", Float.parseFloat("22")));

		};
	}

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}
}
