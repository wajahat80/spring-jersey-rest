package com.rwa.demospringreact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@Configuration
//@EnableAutoConfiguration*/
//@ComponentScan({"com.rwa"})// This needs to be define if your sources are in different package hierarchy than springboot application package
@SpringBootApplication //@SpringBootApplication annotation is equivalent to using @Configuration, @EnableAutoConfiguration and @ComponentScan with their default attributes
public class SpringJerseyRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJerseyRestApplication.class, args);
	}
}
