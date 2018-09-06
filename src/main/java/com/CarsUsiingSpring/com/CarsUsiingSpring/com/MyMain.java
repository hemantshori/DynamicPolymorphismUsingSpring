package com.CarsUsiingSpring.com.CarsUsiingSpring.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyMain {

	public static void main(String[] args) {
      
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Factory.class);
		//MyTestBean2 tBean = applicationContext.getBean(MyTestBean2.class);
		TestInterface tBean = applicationContext.getBean(MyTestBean.class);
		
		
		tBean.MyTestBean();
		tBean.MyTestBean2();
		tBean.MyTestBean22();
		tBean.MyTestBean23();
	

	}

}
