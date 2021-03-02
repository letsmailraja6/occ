package eg1;

public class ArithmeticOperators {

	public static void main(String[] args) {
		int x=10; //assignment operator
		int y=9;
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		
		System.out.println("result of x+y is =  "+(x+y));
		
		x-=10; //x=x-10;
		System.out.println("x : "+x);
		//+= %= /=  -- Short circuit operators
		
		System.out.println(x++); //post increment
		System.out.println(x);
		System.out.println(++x); //pre increment
		System.out.println(x--); //post decrement
		System.out.println(x);
		System.out.println(--x); //pre decrement

	}

}
