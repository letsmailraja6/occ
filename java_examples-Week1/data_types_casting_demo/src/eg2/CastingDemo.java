package eg2;

public class CastingDemo {

	public static void main(String[] args) {
		/*
		 * Casting - Conversion of one data type to another
		 * 
		 * 1)Implicit Casting - Taken care by java compiler itself by default. 
		 * 						In this you can assign any of the smaller size data type to larger ones.
		 * 
		 * 2)Explicit Casting - Done by the programmer explicitly for the conversion of larger ones to the smaller.
		 */

		int s=100;
		double d=s; //implicit casting
		System.out.println("s = "+s);
		System.out.println("d = "+d);
		
		float a=s;//implicit casting
		System.out.println("a = "+a);
		
		a=22.33f;
		System.out.println("a = "+a);
		int x=(int)a; //explicit casting
		System.out.println("x = "+x);
		
		char c='D';
		System.out.println("c = "+c);
		x=c; //implicit
		System.out.println("x = "+x);
		x=100;
		System.out.println("x = "+x);
		c=(char)x; //explicit
		System.out.println("c = "+c);
		
		
	}

}
