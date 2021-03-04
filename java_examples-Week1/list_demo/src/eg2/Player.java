package eg2;

public class Player {

	private int id;
	private String name;
	
	
	public Player(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + "]";
	}
	
	
}
