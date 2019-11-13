/*
 * @author Karan Shah
 * @version 1.0
 * @created 10-Oct-2019
 *
*/

package org.theenergymashuplab.cts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("org.theenergymashuplab")
@SpringBootApplication
//@EnableJpaAuditing
//@Import({ApplicationConfig.class })
public class EnergyApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnergyApplication.class, args);
	}

	/*@Bean
	CommandLineRunner initDatabase(BookRepository repository) {
		return args -> {
			repository.save(new Book("A Guide to the Bodhisattva Way of Life", "Santideva", new BigDecimal("15.41")));
			repository.save(new Book("The Life-Changing Magic of Tidying Up", "Marie Kondo", new BigDecimal("9.69")));
			repository.save(new Book("Refactoring: Improving the Design of Existing Code", "Martin Fowler", new BigDecimal("47.99")));
		};
	}*/
}
