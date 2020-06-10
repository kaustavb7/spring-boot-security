package com.training.coder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.training.coder.repository.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringSecurityMysqlJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityMysqlJpaApplication.class, args);
	}

}


