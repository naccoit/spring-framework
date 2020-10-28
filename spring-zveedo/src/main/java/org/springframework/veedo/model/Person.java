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

	@Value("#{user}")
	private User user;

	@Autowired
	private ApplicationEventPublisher publisher;

	public void eventPublisher() {
		publisher.publishEvent(new DemoEvent(this, "张三", "23"));
	}

	public String getName() {
		return name;
	}

	public User getUser() {
		return user;
	}
}
