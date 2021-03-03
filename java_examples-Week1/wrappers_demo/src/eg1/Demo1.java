package eg1;

public class Demo1 {

	public static void main(String[] args) {
		
		Integer i1=10;
		Integer i2=10;
		Integer i3=new Integer(10);
		
		System.out.println("i1==i2 : "+(i1==i2));
		System.out.println("i1==i3 : "+(i1==i3));
		
		System.out.println("(i1.equals(i2)) : "+(i1.equals(i2)));
		System.out.println("(i1.equals(i3)) : "+(i1.equals(i3)));
		
		
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2));
		System.out.println(System.identityHashCode(i3));
		
		i2++;
		System.out.println(System.identityHashCode(i2));
		
		
		int x=i2;   //auto boxing -> obj to primitive
		System.out.println("x = "+x);
		x=7;
		i2=x; 
		System.out.println("i2 = "+i2);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		
		String s="123";
		int d=Integer.parseInt(s);
		System.out.println(d);
		
		
		Float f=i2.floatValue();  //double long etc
		System.out.println("f = "+f);
		
		f=22.333f;
		int m=f.intValue();
		System.out.println("m = "+m);
		
		
		Integer x1=19;
		System.out.println(x1.compareTo(19)); //both are same so it will give 0
		System.out.println(x1.compareTo(22)); //2nd value is greater then the first so it will give -ve value here
		System.out.println(x1.compareTo(10)); //1st value is greater then the second so it will give +ve value here
		
		
	}

}

//Assignment Wrapper classes -> Try the same above with Float, Double and Long classes
