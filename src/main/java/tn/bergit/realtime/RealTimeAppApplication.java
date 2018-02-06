package tn.bergit.realtime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EntityScan( basePackages = {"tn.bergit.relatime.bo"} )
//@ComponentScan("tn.bergit.relatime")
//@EnableJpaRepositories("tn.bergit.relatime.repository")
public class RealTimeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RealTimeAppApplication.class, args);
	}
	
}
