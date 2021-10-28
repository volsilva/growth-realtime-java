package com.example.messagingstompwebsocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class MessagingStompWebsocketApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessagingStompWebsocketApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
//						.allowCredentials(false)
						.allowedOrigins("*")
//						.allowedMethods("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS")
						.allowedHeaders("Content-Type, Access-Control-Allow-Origin, Access-Control-Allow-Headers, Authorization, X-Requested-With, requestId, Correlation-Id");
			}
		};
	}
}
