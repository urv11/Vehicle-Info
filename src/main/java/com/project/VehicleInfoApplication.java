package com.project;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages ="com.*")
@EnableJpaRepositories("com.*")
@EntityScan("com.*")
@ComponentScan("com.project.")
public class VehicleInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehicleInfoApplication.class, args);
	}

}