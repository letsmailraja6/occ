package eg1;

import eg2.TestModifierEg2;

public class Demo1 extends TestModifierEg2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestModifier t1=new TestModifier();
		t1.helloDefault();
		t1.helloProtected();
		t1.helloPublic();
		
		System.out.println("\n");
		
		TestModifierEg2 t2=new TestModifierEg2();
	//	t2.helloDefault();
	//	t2.helloProtected();
		t2.helloPublic();
		
		
		Demo1 d=new Demo1();
		d.helloProtected();
	}

	/*
	 * public - everywhere
	 * protected - within the package and if any class has extended there it will be accessible
	 * default - package level
	 * private - within the class
	 */
}
