package dev.simonverhoeven.springframework7demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringFramework7DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFramework7DemoApplication.class, args);
	}

}
