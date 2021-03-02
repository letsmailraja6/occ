package eg1;

public class HelloArray {

	public static void main(String[] args) {
		
		int ar[]= {22,11,33,1,88,22,11};
		
		System.out.println(ar.length);
		System.out.println("ar[0] : "+ar[0]);
		System.out.println("ar[6] : "+ar[6]);
		
		//System.out.println("ar[7] : "+ar[-7]);
		
		for (int i = 0; i < ar.length; i++) {
			System.out.println("ar["+i+"] : "+ar[i]);
		}
		
		System.out.println("Printing all even numbers");
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]%2==0) {
				System.out.println(ar[i]);
			}
		}

	}

}
