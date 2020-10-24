package org.springframework.veedo;

import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.veedo.config.AppConfig;
import org.springframework.veedo.model.Person;
import org.springframework.veedo.model.User;

/**
 * @author naccoitcc
 * @date 2020/9/19 12:43
 */
public class MainTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//		System.out.println(applicationContext.getBean("naccoFactoryBean"));
		Person person = (Person) applicationContext.getBean("person");
		System.out.println(person.getName());

//		System.out.println(applicationContext.getBean("naccoFactoryBean"));

//		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();

//		ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(applicationContext);
//		scanner.scan("org.springframework.veedo.model");
//
//		AnnotatedBeanDefinitionReader definitionReader = new AnnotatedBeanDefinitionReader(applicationContext);
//
//		definitionReader.register(Person.class);
//
//		applicationContext.refresh();
//
//		System.out.println(applicationContext.getBean("user"));
	}
}
