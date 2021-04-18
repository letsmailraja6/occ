package test;

public class Test {

	public static void main(String[] args) {
		String temp = "doone";
		int max = 0;
		String longest = null;
		//StringBuilder sb = new StringBuilder();
		for (int i = 0; i < temp.length(); i++) {
			for (int j = i + 1; j < temp.length(); j++) {
				String x = temp.substring(i, j);
				System.out.println(x);
				if (new StringBuilder(x).reverse().toString().equals(x)) {
					System.out.println("in if : "+x);
					if (x.length() > max) {
						max = x.length();
						// =data.setLongestPalindrome(x);
						longest = x;
						System.out.println("long = "+longest);
					}
				}
				
			}
		}
		System.out.println("longest = "+longest);
	}

}
