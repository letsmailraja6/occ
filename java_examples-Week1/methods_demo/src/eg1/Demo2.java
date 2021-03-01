package eg1;

public class Demo2 {
	//1)Static blocks can be accessed without creating an object because static blocks are 
	//	loaded into the memory directly and they belong to class not object.
	//2)Non static blocks belongs to object or instance of the class which are accessible only after creation of object.

	public static void main(String[] args) {
		//Syntax for creating object
		//Classname obj=new Constructor();
		//using new keyword the memory for the class is allocated dynamically at run time of the application
		
		Demo2 d=new Demo2();
		d.helloNonStatic();
		int r=d.sub(100, 190);
		System.out.println("r = "+r);
		
		//sub(1,1);
	}
	
	public void helloNonStatic() {
		System.out.println("Hello from helloNonStatic()");
	}
	
	public int sub(int a,int b) {
		return a-b;
	}

}
