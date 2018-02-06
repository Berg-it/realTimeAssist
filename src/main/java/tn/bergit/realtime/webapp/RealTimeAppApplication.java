package tn.bergit.realtime.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan( basePackages = {"tn.bergit.relatime.bo"} )
@ComponentScan("tn.bergit.relatime")
@EnableJpaRepositories("tn.bergit.relatime.repository")
public class RealTimeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RealTimeAppApplication.class, args);
	}
}
