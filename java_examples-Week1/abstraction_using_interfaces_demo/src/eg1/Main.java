package eg1;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("Accessing MyInterface");
		MyInterface m1=new Implementor();
		m1.method1();
		m1.method2();
		m1.method3();
		m1.method4();
		m1.common();
		
		System.out.println("\n\nAccessing MyInterface2");
		MyInterface2 m2=new Implementor();
		m2.common();
		m2.feature1();
		m2.feature2();

	}

}
