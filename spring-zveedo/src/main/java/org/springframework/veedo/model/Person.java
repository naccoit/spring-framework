package org.springframework.veedo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author naccoitcc
 * @date 2020/10/11 20:29
 */
@Component
public class Person {

	@Value("#{24}")
	private String name;
//
//	@Value("#{user}")
//	private User user;


	public Person() {
		System.out.println("**********无参**********");
	}

	@Autowired(required = false)
	public Person(User name, User user) {
		System.out.println("**********两个参数**********");
	}

	@Autowired(required = false)
	public Person(User name, User user, User user2) {
		System.out.println("**********三个参数**********");
	}

	@Autowired
	private ApplicationEventPublisher publisher;

	public void eventPublisher() {
		publisher.publishEvent(new DemoEvent(this, "张三", "23"));
	}

	public String getName() {
		return name;
	}

//	public User getUser() {
//		return user;
//	}
}
