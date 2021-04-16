package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author cliffside
 * @date 2021-04-16 22:11
 */
public class testIOC {
	public static void main(String[] args) {

			ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application.xml");
			user bean = classPathXmlApplicationContext.getBean(user.class);
			System.out.println(bean.getAge());
			System.out.println(bean.getName());

	}
}
