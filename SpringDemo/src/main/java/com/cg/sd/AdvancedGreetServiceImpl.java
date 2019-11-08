package com.cg.sd;

public class AdvancedGreetServiceImpl implements GreetService {
	private GreetNoteProvider provider;

	public GreetNoteProvider getProvider() {
		return provider;
	}

	public void setProvider(GreetNoteProvider provider) {
		this.provider = provider;
	}

	public String greet(String userName) {
		return provider.getGreetNote() + userName;
	}

}
