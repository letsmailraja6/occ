package eg1;

public class CalciMain {
int x;
	public static void main(String[] args) {
		
		
		Calculator vinay1=new Calculator("TEST");
		
		System.out.println(vinay1.add());
		Calculator v2=new Calculator();

		
		Calculator something=new Calculator(10,22);
		System.out.println(something.add());
		System.out.println(something.multiply());
	}
//	public CalciMain() {
//		System.out.println("hello from other constructor");
//	}
}
