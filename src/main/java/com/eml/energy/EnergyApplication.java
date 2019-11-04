/**
 * @author Karan Shah
 * @version 1.0
 * @created 10-Oct-2019
 */

package com.eml.energy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
//@EnableJpaAuditing
//@Import({ApplicationConfig.class })
public class EnergyApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnergyApplication.class, args);
	}

}
