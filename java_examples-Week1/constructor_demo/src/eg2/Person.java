package eg2;

public class Person {

	private int id;
	private String name;
	private String city;
	private int age;
	private Address personAddress; //has A relationShip
	private Address perManentAddress;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public Person(int id, String name,String city,int age) {
		this(id,name);//Person(id,name) -> constructor chaining
		this.city=city;
		this.age=age;
	}
	
	public Person(int id, String name,String city,int age,Address personAddress) {
		this(id,name,city,age);//Person(id,name) -> constructor chaining
		this.personAddress=personAddress;
	}
	

	
	public void setCity(String city) {
		this.city=city;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	@Override  //annotation
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", city=" + city + ", age=" + age + ", personAddress="
				+ personAddress + "]";
	}
	

	
	
	
}
