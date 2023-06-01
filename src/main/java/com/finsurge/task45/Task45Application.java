package com.finsurge.task45;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@ComponentScan({"com.finsurge", "com.finsurge.controller","com.finsurge.service"})
public class Task45Application {

	public static void main(String[] args) {
		SpringApplication.run(Task45Application.class, args);
	}

}
