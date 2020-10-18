package org.springframework.veedo.model;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

/**
 * @author naccoitcc
 * @date 2020/10/11 20:29
 */
@Component
public class Person {

	private String name = "我是教师";

	public String getName() {
		return name;
	}
}
