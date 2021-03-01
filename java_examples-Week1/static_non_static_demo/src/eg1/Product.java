package eg1;

public class Product {

	private int id; //global instance level variable
	private String name; //global instance level object
	private double cost;//global instance level variable
	private static float discount=0.2f;  //global class level variable which is common for all the objects of this class
	
	
	public static void main(String[] args) {
		
		Product p=new Product();
		p.id=100;
		p.name="TV";
		p.cost=102.22;
		System.out.println("Printing details of product p");
		p.printProduct();
		
		Product p2=new Product();
		p2.id=101;
		//p.name="TV";
		p2.cost=112.22;
		System.out.println("\nPrinting details of product p2");
		p2.printProduct();
		discount=0.8f;
		System.out.println("\nPrinting details of product p again");
		p.printProduct();
		
		System.out.println("\nPrinting details of product p2 again");
		p2.printProduct();
		

	}
	
	public void printProduct() {
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Cost : "+cost);
		System.out.println("Discount : "+discount);
	}

}
