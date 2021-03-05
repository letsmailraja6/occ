package eg2;

public class Main {

	public static void main(String[] args) {
		
		Player p1=new Player(100, "Raghav", "India", 4.55);
		
		System.out.println(p1);
		
		Project project=new Project(909090, "Some project", "Some client");
		Employee e=new Employee(900, "Gaurav", "Revature", "Associate", project);
		
		
		System.out.println(e);

	}

}
