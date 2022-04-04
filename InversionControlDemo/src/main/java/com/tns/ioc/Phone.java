package com.tns.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Phone {

	public static void main(String[] args) {
		// Hard Coding
		/*Airtel a = new Airtel();
		a.calling();
		a.data();
		
		Jio j = new Jio();
		j.calling();
		j.data();
		*/
		
		// IOC Container
		 ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		 
		 /*
		Airtel a= c.getBean("airtel",Airtel.class);
		a.calling();
		a.data();
		
		Jio b= c.getBean("jio",Jio.class);
		b.calling();
		b.data();
		*/
		
		// Generalized things
		Sim s= c.getBean("sim",Sim.class);
		s.calling();
		s.data();
}
}