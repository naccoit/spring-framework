package org.springframework.veedo.service;

/**
 * @author naccoitcc
 * @date 2020/11/12 09:30
 */
public class UserServiceImpl implements UserService {

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public void test() {
		System.out.println("这是test(..),目标方法");
	}
}
