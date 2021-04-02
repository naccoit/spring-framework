package org.springframework.veedo.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.veedo.model.User;

/**
 * @author naccoitcc
 * @date 2020/10/28 14:21
 */
public class VeedoBeanFactoryPostProcessor implements BeanDefinitionRegistryPostProcessor {

	/**
	 * 注册BeanDefinition的registry注册方法
	 *
	 * @param registry the bean definition registry used by the application context
	 * @throws BeansException
	 */
	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
//		RootBeanDefinition beanDefinition = new RootBeanDefinition();
//		beanDefinition.setBeanClass(User.class);
//		registry.registerBeanDefinition("user",beanDefinition);
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

	}
}
