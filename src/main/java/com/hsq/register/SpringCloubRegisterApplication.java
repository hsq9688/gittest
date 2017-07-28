package com.hsq.register;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringCloubRegisterApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(SpringCloubRegisterApplication.class).web(true).run(args);
	}
}
