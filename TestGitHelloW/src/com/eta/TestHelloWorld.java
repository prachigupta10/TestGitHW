package com.eta;

public class TestHelloWorld {
	
	public static void greeting(){
		System.out.println("Hello World!");
	}
	
	public static void main(String[] args) {
		System.out.println("Greeting ...");
		TestHelloWorld.greeting();
		System.out.println("Greeting Done");
		System.out.println("Adding Hi to greeting");
	}

}
