package com.nokia.lifo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.nokia.constants.Constants;

@SpringBootApplication(scanBasePackages =  {Constants.BASE_PACKAGE})
@ComponentScan({Constants.BASE_PACKAGE})
@EntityScan(Constants.BASE_PACKAGE)
@EnableJpaRepositories(Constants.BASE_PACKAGE)
public class LifoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LifoApplication.class, args);
	}

}
