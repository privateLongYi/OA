package com.hr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.hr.mapper")
@EnableScheduling
@EnableCaching
public class OasysApplication {

	public static void main(String[] args) {

		SpringApplication.run(OasysApplication.class, args);
	}

}
