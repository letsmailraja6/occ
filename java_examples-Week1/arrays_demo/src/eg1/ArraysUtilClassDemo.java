package eg1;

import java.util.Arrays;

public class ArraysUtilClassDemo {

	public static void main(String[] args) {
		int ar[]= {22,11,33,1,88,22,11,88};
		
		System.out.println(ar);
		
		System.out.println(Arrays.toString(ar));
		
		Arrays.sort(ar);
		System.out.println("After sorting");
		System.out.println(Arrays.toString(ar));
		
		
		//binarySearch on array elements -> for which your array should be sorted in ascending. 
		//binarySearch will return +ve value if the search element is found, else it will return -ve value
		
		
		System.out.println(Arrays.binarySearch(ar, 100));
		System.out.println(Arrays.binarySearch(ar, 88));
		System.out.println(Arrays.binarySearch(ar, 10));
		
		
		int ar1[]=Arrays.copyOf(ar, ar.length+6);
		System.out.println("ar1 = "+Arrays.toString(ar1));

	}

}
