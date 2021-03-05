package eg2;

public class Employee extends Person {

	private String organization;
	private String designation;
	private Project project;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String organization, String designation, Project project) {
		super(id, name);
		this.organization = organization;
		this.designation = designation;
		this.project = project;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "Employee [organization=" + organization + ", designation=" + designation + ", project=" + project
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
}
