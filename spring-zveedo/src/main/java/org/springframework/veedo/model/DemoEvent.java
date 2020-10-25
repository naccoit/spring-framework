package org.springframework.veedo.model;

import org.springframework.context.ApplicationEvent;

/**
 * @author naccoitcc
 * @date 2020/10/25 22:32
 */
public class DemoEvent extends ApplicationEvent {

	private String name;

	private String age;

	/**
	 * Create a new {@code ApplicationEvent}.
	 *
	 * @param source the object on which the event initially occurred or with
	 *               which the event is associated (never {@code null})
	 */

	public DemoEvent(Object source, String name, String age) {
		super(source);
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
}
