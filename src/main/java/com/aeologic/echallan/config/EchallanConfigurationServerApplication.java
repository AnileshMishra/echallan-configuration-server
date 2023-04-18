package com.aeologic.echallan.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class EchallanConfigurationServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EchallanConfigurationServerApplication.class, args);
	}

}
