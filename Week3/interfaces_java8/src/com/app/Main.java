package com.app;

public class Main {

	public static void main(String[] args) {
		InterfaceJava8.helloStatic();
		InterfaceJava8 i = new Implementor();
		i.iamDefault();
		MyFunctional m = new Implementor();
		m.helloFunctional();

		MyFunctional m1 = new MyFunctional() {

			@Override
			public void helloFunctional() {
				// TODO Auto-generated method stub
				System.out.println("Hello anonymous");
			}
		};
		m1.helloFunctional();

		MyFunctional m2 = new MyFunctional() {

			@Override
			public void helloFunctional() {
				// TODO Auto-generated method stub
				System.out.println("Hello anonymous Again");
			}
		};
		m2.helloFunctional();

		// Lambda Expression which can be used on Functional Interfaces

		MyFunctional m3 = () -> System.out.println("Hello Lambda");
		m3.helloFunctional();

		MyFunctional m4 = () -> System.out.println("Hello Lambda Again");
		m4.helloFunctional();

		HelloFunctional h = (n) -> {
			return "Hellloooo " + n;
		};
		System.out.println(h.sayHello("Jack"));
		System.out.println(h.sayHello("Jackeyyy"));
		
		Addition a=(x,y,z)->{
			return x+y+z;
		};
		System.out.println(a.sum(100, 99, 7777));
	}

}
