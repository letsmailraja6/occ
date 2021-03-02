package eg1;

public class LogicalOperators {

	public static void main(String[] args) {
		
		int x=0;
		if(x>1 && x%2!=0) {
			System.out.println("yes x is greater then one and is also odd");
		}else {
			System.out.println("no");
		}
		
		
		if(x>1 || x%2!=0) {
			System.out.println("yes x is greater then one or it is odd");
		}else {
			System.out.println("no");
		}
		
		if(!(x>1)) {
			System.out.println("Yes it  is not greater than 1");
		}else {
			System.out.println("no it is greater than 1");
		}
		
		x=5;
		//ternary operator(?:)
		boolean b=(x>4)?true:false;
		System.out.println(b);
		int marks=10;
		String result=(marks>=70)?"pass":"fail";
		System.out.println(result);

	}

}
//Bitwise Operators
