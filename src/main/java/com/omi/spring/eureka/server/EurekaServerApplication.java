package com.omi.spring.eureka.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

	private static final Logger log = (Logger) LoggerFactory.getLogger(EurekaServerApplication.class);


	public static void main(String[] args) {
		log.info("EurekaServerApplication => main => :");
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
