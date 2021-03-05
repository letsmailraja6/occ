package eg2;

public class Player extends Person {

	private String teamName;
	private double rating;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}
	
	public Player(int id,String name,String teamName,double rating) {
		super(id,name);
		this.teamName=teamName;
		this.rating=rating;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Player [teamName=" + teamName + ", rating=" + rating + ", toString()=" + super.toString() + "]";
	}
	
	
}
