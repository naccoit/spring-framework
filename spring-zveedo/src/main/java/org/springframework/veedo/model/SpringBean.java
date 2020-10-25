package org.springframework.veedo.model;

import org.springframework.context.Lifecycle;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

/**
 * @author naccoitcc
 * @date 2020/10/25 22:13
 */
@Component
public class SpringBean implements SmartLifecycle {

	@Override
	public void start() {
		System.out.println("start...");
	}

	@Override
	public void stop() {
		System.out.println("stop.....");
	}

	@Override
	public boolean isRunning() {
		return false;
	}
}
