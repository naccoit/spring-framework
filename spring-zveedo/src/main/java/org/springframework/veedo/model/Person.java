package org.springframework.veedo.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

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

	public String getName() {
		return name;
	}

	public User getUser() {
		return user;
	}
}
