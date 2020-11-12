package org.springframework.veedo.model;

/**
 * @author naccoitcc
 * @date 2020/11/12 10:06
 *
 * 验证双{{}}实例化类的加载顺序问题
 */
public class Niubility {

	private String name;

	public Niubility() {
		System.out.println("默认构造方法");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("set方法");
		this.name = name;
	}
}
