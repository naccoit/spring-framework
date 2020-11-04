package org.springframework.veedo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.veedo.config.AppConfig;
import org.springframework.veedo.model.Person;

/**
 * @author naccoitcc
 * @date 2020/9/19 12:43
 */
public class MainTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Person person = (Person) applicationContext.getBean("person");
		System.out.println(person.getName());

	}
}
