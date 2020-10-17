package org.springframework.veedo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.veedo.model.Person;

/**
 * @author naccoitcc
 * @date 2020/9/19 12:44
 */
@Configuration
@ComponentScan("org.springframework.veedo")
public class AppConfig {

	@Bean
	public Person getPerson(){
		return new Person();
	}
}
