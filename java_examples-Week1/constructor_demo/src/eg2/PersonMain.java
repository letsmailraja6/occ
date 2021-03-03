package eg2;

public class PersonMain {

	public static void main(String[] args) {
		
		Person p1=new Person(100, "Rajesh");
		System.out.println(p1);
		//System.out.println(p1.toString());
		
		Person p2=new Person(101, "Divya");
		System.out.println(p2);
		
		p2.setAge(26);
		p2.setCity("Newyork");
		
		p1.setAge(21);
		p1.setCity("NJ");
		
		Person p3=new Person(102, "Shawn", "Bangalore", 23);
		System.out.println(p3);
		
		
		System.out.println("p1 - "+p1);
		System.out.println("p2 - "+p2);
		
		
		Address a=new Address(99999, "xyz street", 200090);
		Person p4=new Person(105, "Sachin", "Mumbai", 33, a);
		
		//p4.personAddress;
		System.out.println(p4);
		
	}

}

//Assignment
//Create Employee class with id,name,age,email
//and Project(projectid,projectname,clientname)
//and present and permanent Address(aid,streetname,city,state,zip)
