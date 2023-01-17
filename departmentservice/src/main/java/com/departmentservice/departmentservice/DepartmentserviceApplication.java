package com.departmentservice.departmentservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@ComponentScan({"com.departmentservice.departmentservice.controller", "com.departmentservice.departmentservice.service"})
@EntityScan("com.departmentservice.departmentservice.entity")
@EnableJpaRepositories("com.departmentservice.departmentservice.repository")
@EnableFeignClients("com.departmentservice.departmentservice.feignclients")
@EnableEurekaClient
public class DepartmentserviceApplication {
	/*
	 * @Value("${address.service.url}") private String addressServiceUrl;
	 */
	@Value("${student.service.url}")
	private String studentServiceUrl;

	public static void main(String[] args) {
		SpringApplication.run(DepartmentserviceApplication.class, args);
	}
	/*
	 * @Bean public WebClient webClient () { WebClient webClient
	 * =WebClient.builder() .baseUrl(addressServiceUrl).build();
	 * 
	 * return webClient; }
	 */
	
	@Bean
	public WebClient webClient1 () {
		WebClient webClient =WebClient.builder()
				.baseUrl(studentServiceUrl).build();
		
		return webClient;
	}
}
