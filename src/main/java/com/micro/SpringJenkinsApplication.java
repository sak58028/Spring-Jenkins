package com.micro;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {

		public static Logger loger=LoggerFactory.getLogger(SpringJenkinsApplication.class);
		
		@PostConstruct
		public void intt() {
			loger.info("--STARTED--");
		}
	public static void main(String[] args) {
		
		loger.info("--Application Started--");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
