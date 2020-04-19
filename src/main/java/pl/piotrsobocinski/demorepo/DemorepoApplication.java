package pl.piotrsobocinski.demorepo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.convert.Jsr310Converters;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.persistence.Entity;

// Dzięki JSR310 JPA jest w stanie przekonwertować czas podany w bazie
// na nowoczesną klasę LocalTime.
@EntityScan(
		basePackageClasses = {DemorepoApplication.class, Jsr310JpaConverters.class}
)
@SpringBootApplication
public class DemorepoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemorepoApplication.class, args);
	}
}