package com.eml.energy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EnergyApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnergyApplication.class, args);
	}

}
