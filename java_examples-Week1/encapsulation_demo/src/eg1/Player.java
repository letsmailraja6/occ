package eg1;

public class Player {

	//data members and methods should be tightly coupled
	private int id;
	private String name;
	public Player() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Player(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public void setId(int id) {
		this.id=id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
}
