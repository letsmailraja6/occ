package eg1;

public class PlayerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p=new Player();
		//p.id=100; //data leakage
		
		p.setId(1000);
		p.setName("Ayush");
		
		
		System.out.println("Id : "+p.getId());
		System.out.println("Name : "+p.getName());
		
	}

}
