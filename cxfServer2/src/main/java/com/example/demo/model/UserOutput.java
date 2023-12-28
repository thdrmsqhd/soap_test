package com.example.demo.model;


import java.io.Serializable;

public class UserOutput implements Serializable {
    private static final long serialVersionUID = -3628469724795296287L;

	private String userOutput;
    
    public UserOutput() {}
    
    public UserOutput(String userOutput) {
		super();
		this.userOutput = userOutput;
	}

	public String getUserOutput() {
		return userOutput;
	}

	public void setUserOutput(String userOutput) {
		this.userOutput = userOutput;
	}
	
    
}