package eg3;

public class StringDemo {

	public static void main(String[] args) {
		String s="Hello from string... String is a object not a data type";
		
		System.out.println(s);
		//java reads everything as String and Java writes everything as String
		
		String d="100";
		int x=Integer.parseInt(d);//parse String to int
		System.out.println("x = "+x);
		d="22.333";
		double f=Double.parseDouble(d);//parse String to double.
		//Similarly you have methods for Byte, Short, Long, Float and Boolean
		System.out.println("f = "+f);
		s=f+""; //anything in java can be converted to String object just by doing this.
		System.out.println("s = "+s);

	}

}
