package org.springframework.veedo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.veedo.config.AppConfig;
import org.springframework.veedo.model.User;

/**
 * @author naccoitcc
 * @date 2020/9/19 11:25
 */
public class MainTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		User user = (User) applicationContext.getBean("user");
		System.out.println(user.name);
	}
}
