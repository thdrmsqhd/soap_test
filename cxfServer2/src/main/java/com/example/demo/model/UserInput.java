package com.example.demo.model;


import java.io.Serializable;

public class UserInput implements Serializable {
    private static final long serialVersionUID = -3628469724795296287L;

	private String userInput;
    
    public UserInput() {}
    
    public UserInput(String userInput) {
		super();
		this.userInput = userInput;
	}

	public String getUserInput() {
		return userInput;
	}

	public void setUserInput(String userInput) {
		this.userInput = userInput;
	}

    
	
}