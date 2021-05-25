package org.springframework.veedo.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.BeanInitializationException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.veedo.model.User;

/**
 * @author naccoitcc
 * @date 2020/10/18 16:56
 */
@Component
public class NaccoBeanPostProcessor implements InstantiationAwareBeanPostProcessor, ApplicationContextAware {

	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		if (beanName.equals("user")) {
			System.out.println("实例化前...." + beanName);
		}
		// 实例化前,可以自行创建对象,直接走到初始化后逻辑
		return null;
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		if (beanName.equals("user")) {
			System.out.println("实例化后...." + beanName);
		}
		return true;
	}

	/**
	 * Post-process the given property values before the factory applies them to the given bean, without any need for property descriptors.
	 *
	 * @param pvs      the property values that the factory is about to apply (never {@code null})
	 * @param bean     the bean instance created, but whose properties have not yet been set
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
		if (beanName.equals("user")) {
			System.out.println("填充属性前..." + beanName);
		}
		return null;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("user")) {
			System.out.println("初始化前..." + beanName);
		}
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("user")) {
			System.out.println("初始化后..." + beanName);
		}
		return null;
	}


	/**
	 * Set the ApplicationContext that this object runs in.
	 * Normally this call will be used to initialize the object.
	 * <p>Invoked after population of normal bean properties but before an init callback such
	 * as {@link InitializingBean#afterPropertiesSet()}
	 * or a custom init-method. Invoked after {@link ResourceLoaderAware#setResourceLoader},
	 * {@link ApplicationEventPublisherAware#setApplicationEventPublisher} and
	 * {@link MessageSourceAware}, if applicable.
	 *
	 * @param applicationContext the ApplicationContext object to be used by this object
	 * @throws ApplicationContextException in case of context initialization errors
	 * @throws BeansException              if thrown by application context methods
	 * @see BeanInitializationException
	 */
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("此段代码执行时机: 在bean生命周期的执行Aware接口后,初始化前的前置处理器执行.");
	}
}
