package org.springframework.veedo.model;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

/**
 * @author naccoitcc
 * @date 2020/9/19 12:44
 */
@Component
public class User implements InitializingBean {

//	@Autowired
//	Person getPerson;

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

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("初始化...getPerson.getName()");
	}
}
