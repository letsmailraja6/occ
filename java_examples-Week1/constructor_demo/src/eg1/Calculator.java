package eg1;

public class Calculator {

	
	//Calculator(){} -> java compiler keep a default constructor in all
	//					java classes by default, until the programmer
	//					creates one of his own.
	
	
	private int a;
	private int b;
	
	public Calculator(String s) {
		System.out.println("Hello constructor "+s);
	}
	
	public Calculator() {
		System.out.println("hello from other constructor");
	}
	
	
	public Calculator(int a,int b) {
		this.a=a;
		this.b=b;
		
	}
	
	
	public int add() {
		return a+b;
	}
	
	public int multiply() {
		return a*b;
	}
	
	
	
}
