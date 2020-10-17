package org.springframework.veedo.service;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;
import org.springframework.veedo.model.User;

/**
 * @author naccoitcc
 * @date 2020/10/17 20:18
 */
@Component
public class NaccoFactoryBean implements FactoryBean<Object> {

	@Override
	public Object getObject() throws Exception {
		return new User();
	}

	@Override
	public Class<?> getObjectType() {
		return null;
	}
}
