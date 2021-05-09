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
		RootBeanDefinition beanDefinition = new RootBeanDefinition();
		beanDefinition.setBeanClass(User.class);
		registry.registerBeanDefinition("user",beanDefinition);
		System.out.println("============ 实现具有注册功能的BeanDefinition后置处理器 ============");
	}

	/**
	 * Modify the application context's internal bean factory after its standard
	 * initialization. All bean definitions will have been loaded, but no beans
	 * will have been instantiated yet. This allows for overriding or adding
	 * properties even to eager-initializing beans.
	 *
	 * @param beanFactory the bean factory used by the application context
	 * @throws BeansException in case of errors
	 */
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("这个方法是啥时候调用????");
	}
}
