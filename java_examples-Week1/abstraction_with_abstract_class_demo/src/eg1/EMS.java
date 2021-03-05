package eg1;

public abstract class EMS {

	public abstract void addEmployee();
	public abstract void updateEmployee();
	public abstract void calculateEmployeeSalary();
	public abstract void deleteEmployee();
	
	public void commonEmployeeFeature() {
		System.out.println("This implementation is common across any EMS system");
	}
}
