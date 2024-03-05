package com.example.boot02;

import com.example.boot02.bean.Person;
import com.example.boot02.bean.Pig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@EnableConfigurationProperties(Pig.class)
@SpringBootApplication
public class Boot02Application {

	public static void main(String[] args) {
		ApplicationContext run = SpringApplication.run(Boot02Application.class, args);
	}

}
