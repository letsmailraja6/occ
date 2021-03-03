package eg1;

public class Palindrome {

	public static void main(String[] args) {

		String s = "madame";
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		String temp = sb.toString();
		if (s.equals(temp)) {
			System.out.println(s + " is Palindrome");
		} else {
			System.out.println(s + " is not a Palindrome");
		}

		String s1 = "zooz";

		if (new StringBuffer(s1).reverse().toString().equals(s1)) {
			System.out.println(s1 + " is palin");
		} else {
			System.out.println(s1 + " is not palin");
		}

		
		int x=1012;
		String s2 = x+"";

		if (new StringBuffer(s2).reverse().toString().equals(s2)) {
			System.out.println(s2 + " is palin");
		} else {
			System.out.println(s2 + " is not palin");
		}

	}

}
