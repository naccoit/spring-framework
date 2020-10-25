package org.springframework.veedo.model;

import org.springframework.context.ApplicationListener;

import java.util.EventListener;

/**
 * @author naccoitcc
 * @date 2020/10/25 22:30
 */
public class DemoEventListener implements ApplicationListener<DemoEvent> {


	@Override
	public void onApplicationEvent(DemoEvent event) {
		String name = event.getName();
	}
}
