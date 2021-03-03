package eg1;

public class Demo1 {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("hello");
		System.out.println("memory address before modifying : "+System.identityHashCode(sb));
		System.out.println(sb);
		sb.append(" hey").append(true).append('d').append(1111).append(12.33);
		System.out.println(sb);
		
		System.out.println("memory address after modifying : "+System.identityHashCode(sb));
		
		
		sb.insert(1, "JAVA");
		System.out.println(sb);
		
		sb.delete(1, 3);
		System.out.println(sb);
		sb.deleteCharAt(0);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		System.out.println("\n");
		StringBuffer sb1=new StringBuffer("raj");
		StringBuffer sb2=new StringBuffer("rajesh");
		
		if(sb1.toString().equals(sb2.toString())) {
			System.out.println("both are same");
		}else {
			System.out.println("both are not same");
		}

	}

}
