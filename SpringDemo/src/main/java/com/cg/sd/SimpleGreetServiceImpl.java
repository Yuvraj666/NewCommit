package com.cg.sd;

public class SimpleGreetServiceImpl implements GreetService {

	public String greet(String userName) {
		return "Hello " + userName;
	}

}
