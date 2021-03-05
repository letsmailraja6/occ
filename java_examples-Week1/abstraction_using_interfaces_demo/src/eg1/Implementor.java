package eg1;

public class Implementor implements MyInterface,MyInterface2 {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
	System.out.println("method1() from MyInterface value of x = "+MyInterface.x);	
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("method2() from MyInterface value of x = "+MyInterface.x);
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("method3() from MyInterface value of x = "+MyInterface.x);
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		System.out.println("method4() from MyInterface value of x = "+MyInterface.x);	
	}

	@Override
	public void feature1() {
		// TODO Auto-generated method stub
		System.out.println("feature1() from MyInterface2 x = "+MyInterface2.x);
	}

	@Override
	public void feature2() {
		// TODO Auto-generated method stub
		System.out.println("feature2() from MyInterface2 x = "+MyInterface2.x);
	}

	@Override
	public void common() {
		// TODO Auto-generated method stub
		System.out.println("This is common for both MyInterface and MyInterface2");
	}
	
	

}
