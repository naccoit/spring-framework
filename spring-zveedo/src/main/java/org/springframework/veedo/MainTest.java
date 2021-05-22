package org.springframework.veedo;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.veedo.config.AppConfig;
import org.springframework.veedo.model.Fucker;
import org.springframework.veedo.model.Niubility;
import org.springframework.veedo.model.Person;
import org.springframework.veedo.service.UserService;
import org.springframework.veedo.service.UserServiceImpl;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * @author naccoitcc
 * @date 2020/9/19 12:43
 */
public class MainTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		/*ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(applicationContext);

		int scan = scanner.scan("org.springframework.veedo.model");

		System.out.println(scan);

		applicationContext.refresh();

		System.out.println(applicationContext.getBean("user"));*/
//		applicationContext.getEnvironment().getSystemProperties();
//		applicationContext.getEnvironment().getSystemEnvironment();


//		AnnotatedBeanDefinitionReader reader = new AnnotatedBeanDefinitionReader(applicationContext);

//		reader.register(Fucker.class);

//		applicationContext.refresh();

		// dependsOn 循环依赖问题(三者循环依赖也是有问题的)
		System.out.println(applicationContext.getBean("aDependsOn"));
//		System.out.println(applicationContext.getBean("fucker"));

//		Person person = (Person) applicationContext.getBean("person");
//		System.out.println(person.getName());

		// CGLib动态代理
		/*ProxyFactory factory = new ProxyFactory();
		factory.setTarget(new UserServiceImpl());
		factory.setInterfaces(UserService.class);

		factory.addAdvice(new MethodBeforeAdvice() {
			@Override
			public void before(Method method, Object[] args, Object target) throws Throwable {
				System.out.println("执行方法前: 增强逻辑");
			}
		});

		UserService proxy = (UserService) factory.getProxy();
		proxy.test();*/

		/*UserService proxyInstance = (UserService) Proxy.newProxyInstance(UserServiceImpl.class.getClassLoader(), UserServiceImpl.class.getInterfaces(), new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

				System.out.println("这里是增强逻辑...");
				method.invoke(new UserServiceImpl(), args);
				return null;
			}
		});

		proxyInstance.test();*/


		// 语法糖实例化顺序验证
//		Niubility niubility = new Niubility(){{setName("niubi");}};

//		AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
//		beanDefinition.setBeanClass(Fucker.class);
//		beanDefinition.setScope("prototype");
	}
}
