package eg1;

import java.util.Arrays;
import java.util.Scanner;

public class ReadArrayInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		System.out.println("Enter "+n +" elements");
		int ar[]=new int[n];
		for (int i = 0; i < n; i++) {
			ar[i]=sc.nextInt();
		}
		System.out.println("Array before sorting");
		System.out.println(Arrays.toString(ar));
		Arrays.sort(ar);
		System.out.println("\nArray after sorting");
		System.out.println(Arrays.toString(ar));
		
		

	}

}

/*
 * Assignment Arrays
 * -----------------------
 * 1)Take an array input and find all the prime numbers from it.
 * 2)Take an array input and find all the palindrome numbers from it.
 * 3)Take an array input and find the sum of all even numbers.
 * 4)Take an array input and find the max value and min value from that array.
 * 5)Take an array input and find the 2nd max value in that array.
 * 6)Perform CRUD operations on Array
 * Note:Use the Arrays util class effectively
 */
