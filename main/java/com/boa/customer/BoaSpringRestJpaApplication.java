package com.boa.customer;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@EntityScan("com.boa.customer")
@EnableJpaRepositories ("com.boa.repo")
@EnableWebMvc
@ComponentScan({"com.*"})
@SpringBootApplication
public class BoaSpringRestJpaApplication{

	public static void main(String[] args) {
		SpringApplication.run(BoaSpringRestJpaApplication.class, args);
		
			
	}

}
