package org.springframework.veedo;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.veedo.config.AppConfig;
import org.springframework.veedo.model.Niubility;
import org.springframework.veedo.model.Person;
import org.springframework.veedo.service.UserService;
import org.springframework.veedo.service.UserServiceImpl;

import java.lang.reflect.Method;

/**
 * @author naccoitcc
 * @date 2020/9/19 12:43
 */
public class MainTest {

	public static void main(String[] args) {
//		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//		Person person = (Person) applicationContext.getBean("person");
//		System.out.println(person.getName());

		ProxyFactory factory = new ProxyFactory();
		factory.setTarget(new UserServiceImpl());
		factory.setInterfaces(UserService.class);

		factory.addAdvice(new MethodBeforeAdvice() {
			@Override
			public void before(Method method, Object[] args, Object target) throws Throwable {
				System.out.println("执行方法前: 增强逻辑");

			}
		});

		UserService proxy = (UserService) factory.getProxy();
		proxy.test();


		// 语法糖实例化顺序验证
//		Niubility niubility = new Niubility(){{setName("niubi");}};
	}
}
