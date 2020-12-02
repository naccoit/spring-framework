package org.springframework.veedo.model;

import org.springframework.context.annotation.Scope;

/**
 * 测试直接注册类
 * @author naccoitcc
 * @date 2020/12/1 11:19
 */
@Scope("prototype")
public class Fucker {

	private String name;

	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
