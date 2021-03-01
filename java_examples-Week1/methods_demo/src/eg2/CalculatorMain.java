package eg2;

import eg1.Demo1;

public class CalculatorMain {

	public static void main(String[] args) {
	
		System.out.println(Calculator.multiply(10, 30));
		Demo1.myMethod();
		Demo1.helloByName("Vinay");
		
		Calculator c=new Calculator();
		System.out.println(c.add(100, 22222));
		
		System.out.println(c.add(12.333f, 1.22f));
		System.out.println(c.add("hey", " hi"));
		System.out.println(c.add(22, 22, 11));

	}

}
