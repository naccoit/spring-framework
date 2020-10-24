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

	@Value("我是教师")
	private String name;

	public String getName() {
		return name;
	}
}
