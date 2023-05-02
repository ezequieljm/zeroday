package com.zeroday.zeroday;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan(basePackages = "com.zeroday.zeroday")
@EnableWebMvc
public class ZerodayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZerodayApplication.class, args);
	}

}
