package com.app;

public interface InterfaceJava8 {

	public static void helloStatic() {
		System.out.println("Hello static from Java 8 within interface....");
	}
	
	default void iamDefault() {
		System.out.println("Hello default method from Java8");
	}
}
