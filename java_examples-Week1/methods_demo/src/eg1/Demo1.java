package eg1;

public class Demo1 {

	public static void main(String[] args) {

		System.out.println("hello from main()");
		myMethod(); // method call
		helloByName("Rajesh");//pass by reference
		helloByName("");
		int x=33,y=99,p=87;
		int res=add(x, y, p); //call by value or pass by value
		System.out.println("result = "+res);

	}

	// method defination () ->refer to arguments or parameter list
	public static void myMethod() {
		System.out.println("Hello from myMethod()");
	}

	public static void helloByName(String name) {
		if (name == null || name == "") {
			System.out.println("Please enter your name");
		} else {
			System.out.println("Hello " + name);
		}
	}
	
	public static int add(int a,int b , int c) {
		int result=a+b+c;
		return result;
	}

}
