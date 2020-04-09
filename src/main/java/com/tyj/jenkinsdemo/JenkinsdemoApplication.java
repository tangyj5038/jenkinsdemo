package com.tyj.jenkinsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsdemoApplication {

	public static void main(String[] args) {
        System.out.println("---------------------------JenkinsdemoApplication is starting--------------------------------------");
		SpringApplication.run(JenkinsdemoApplication.class, args);
        System.out.println("---------------------------JenkinsdemoApplication is started--------------------------------------");
    }

}
