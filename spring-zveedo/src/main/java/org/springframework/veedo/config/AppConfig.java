package org.springframework.veedo.config;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.veedo.model.Person;
import org.springframework.veedo.model.User;

/**
 * @author naccoitcc
 * @date 2020/9/19 12:44
 */
@ComponentScan("org.springframework.veedo")
@Import(VeedoBeanFactoryPostProcessor.class)
public class AppConfig {

	@Bean
	public Person getPerson(){
		return new Person();
	}

	@Bean
	public ApplicationListener<ApplicationEvent> applicationListener() {
		return event -> System.out.println("接收到了一个事件");
	}
}
