package guru.springframework.spring5webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring5webappApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring5webappApplication.class, args);
	}

	// To evaluate H2 DB go to http://localhost:8080/h2-console/
	// set DB path as > jdbc:h2:mem:testdb


}
