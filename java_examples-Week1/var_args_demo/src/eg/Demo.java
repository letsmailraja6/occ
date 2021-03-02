package eg;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum());
		System.out.println(sum(1,2,3));
		System.out.println(sum(2,12,1,2,3,4,1,34,4,88));
	}
	//... refers to variable number of arguments you can pass any number of arguments between 0 and n;
	// the var args should be the last parameter of method signature and you can have only one var args type in your method signature.
	public static int sum(int ...a) {
		System.out.println("Number of args is "+a.length);
		if(a.length>0) {
			int res=0;
			for (int i = 0; i < a.length; i++) {
				res=res+a[i];
			}
			return res;
		}
		return 0;
	}

}
