package eg1;

public class CountVowels {

	public static void main(String[] args) {
		
		String s="sadSdasdeiou sda   dsfxc dv cc xx  x eAO";
		System.out.println(s.replaceAll("[^aeiouAEIOU]", "").length());

	}

}
