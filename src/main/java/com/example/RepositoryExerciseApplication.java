package com.example;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RepositoryExerciseApplication {
	@Autowired
	private EmployeeRepository employeeRepo;

	public static void main(String[] args) {
		SpringApplication.run(RepositoryExerciseApplication.class, args);
	}

	@Bean
	public CommandLineRunner printAll(ApplicationContext context) {

		Employee employee = new Employee();
		return args -> {
			employee.setFirstName("James");
			employee.setGender("Male");
			employee.setLastName("Bond");
			employee.setDob(new Date(1980 - 10 - 18));
			employeeRepo.save(employee);

		};

	}
}
