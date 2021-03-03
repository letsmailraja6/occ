package eg1;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		
		String s1="hello";
		System.out.println("s1= "+s1);
		System.out.println("s1.toUpperCase() : "+s1.toUpperCase()); //HELLO
		System.out.println("s1= "+s1);
		
		System.out.println("s1.equals(\"HELLO\") : "+s1.equals("HELLO"));
		System.out.println("s1.equals(\"hello\") : "+s1.equals("hello"));
		System.out.println("s1.equals(\"hey\") : "+s1.equals("hey"));
		
		System.out.println("s1.equalsIgnoreCase(\"HELLO\") : "+s1.equalsIgnoreCase("HELLO"));
		System.out.println("s1.equalsIgnoreCase(\"hello\") : "+s1.equalsIgnoreCase("hello"));
		System.out.println("s1.equalsIgnoreCase(\"hey\") : "+s1.equalsIgnoreCase("hey"));
		
		
		System.out.println("s1.contains(\"e\") : "+s1.contains("e"));
		System.out.println("s1.contains(\"ell\") : "+s1.contains("ell"));
		System.out.println("s1.contains(\"lel\") : "+s1.contains("lel"));
		
		System.out.println("s1.startsWith(\"he\") : "+s1.startsWith("he"));
		System.out.println("s1.startsWith(\"eh\") : "+s1.startsWith("eh"));
		
		System.out.println("s1.endsWith(\"he\") : "+s1.endsWith("he"));
		System.out.println("s1.endsWith(\"llo\") : "+s1.endsWith("llo"));
		
		
		System.out.println("s1.length() : "+s1.length());
		System.out.println("s1.charAt(0) : "+s1.charAt(0));
		System.out.println("s1.charAt(2) : "+s1.charAt(2));
		System.out.println("s1.substring(1) : "+s1.substring(1));
		System.out.println("s1.substring(2,4) : "+s1.substring(2,4));
		
		String s2="   sf      ";
		System.out.println("s2 before trim : "+s2);
		s2=s2.trim();
		System.out.println("s2 after trim : "+s2);
		
		String s3="hello world";
		for (int i = 0; i < s3.length(); i++) {
			System.out.println("s3.charAt("+i+") : "+s3.charAt(i));
		}
		
		char c[]=s3.toCharArray();
		System.out.println(Arrays.toString(c));
		
		
		String s4="hey hi everyone. are you hungry? yes i know its lunch time";
		
		String s5[]=s4.split(" ");
		for(String s:s5) {
			System.out.println(s.toUpperCase());
		}
		
		System.out.println("\n\nPrinting alternate words in uppercase");
		for (int i = 0; i < s5.length; i++) {
			if(i%2==0) {
				System.out.println(s5[i].toUpperCase());
			}else {
				System.out.println(s5[i]);
			}
		}
		
	}

}

/* Assignment String - 
 * 1)Take a string input from user and find the count of vowels(aeiouAEIOU) in it.
 * 2)Take a string input and print true if all vowels are present in it else print false.  aHedafioullooo - true aHedafiollooo - false
 * 3)Take a string input and print the characters at prime index to uppercase.
 */
