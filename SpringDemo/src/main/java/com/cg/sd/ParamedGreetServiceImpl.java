package com.cg.sd;

public class ParamedGreetServiceImpl implements GreetService {
	private String greetNote;

	public String getGreetNote() {
		return greetNote;
	}

	public void setGreetNote(String greetNote) {
		this.greetNote = greetNote;
	}

	public String greet(String userName) {
		return greetNote + userName;
	}

}
