package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
public class ClientUiApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientUiApiApplication.class, args);
	}
	@Bean
	public ModelAndView mdlView() {
		return new ModelAndView();
	}
	
	@Bean
	public RestTemplateBuilder builder() {
		return new RestTemplateBuilder();
	}
	
	@Bean
	public RestTemplate template(RestTemplateBuilder builder) {
		
		return builder.build();
	}


}
