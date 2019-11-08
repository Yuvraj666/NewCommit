package com.cg.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.sd.GreetService;
import com.cg.sd.SimpleGreetServiceImpl;

public class App {
	public static void main(String[] args) {
		GreetService gs = new SimpleGreetServiceImpl();
		System.out.println(gs.greet("Dev"));
		ApplicationContext context = new ClassPathXmlApplicationContext("bow.xml");
		GreetService gs1 = (GreetService) context.getBean("sgs");
		System.out.println(gs1.greet("Goyal"));
		GreetService gs2 = (GreetService) context.getBean("pgs");
		System.out.println(gs2.greet(" Flash"));
		GreetService gs3 = (GreetService) context.getBean("ags");
		System.out.println(gs3.greet("Ms. Sinha"));
	}
}
