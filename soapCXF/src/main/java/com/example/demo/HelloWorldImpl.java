package com.example.demo;

import com.tutorialspoint.helloworld.HelloWorldPortType;

public class HelloWorldImpl implements HelloWorldPortType {
	@Override
	public String greetings(String name) {
		return ("hi " + name);
	}
}
