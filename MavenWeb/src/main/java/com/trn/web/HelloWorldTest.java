package com.trn.web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		
		HelloWorld hw = (HelloWorld) context.getBean("helloBean");
		hw.setAge(15);
		hw.setName("Chandra with Git Config");
		hw.printHello();
		hw.getAge();
		hw.getName();
		hw.printThrowException();
	}

}
