package eg1;

public class CRUDArrayDemo {

	public static void main(String[] args) {
		
		int ar[]=new int[6];
		ar[0]=20;
		ar[1]=44;
		ar[2]=5;
		ar[3]=444;
		int n=4; //use n to keep track of elements in array
		System.out.println("Before Insertion");
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i]+" ");
		}
		
		int ele=100;
		int pos=5;
		for(int i=n;i>pos-1;i--) {
			ar[i]=ar[i-1];   //updating
		}
		ar[pos-1]=ele; //inserting 
		n++;
		
		System.out.println("\n\nAfter Insertion");
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i]+" ");
		}
		
		int delpos=2;
		for (int i = delpos-1; i < n; i++) {
			ar[i]=ar[i+1];
		}
		n--;
		System.out.println("\n\nAfter Deletion from positon "+delpos);
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i]+" ");
		}
	}

}
