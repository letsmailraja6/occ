package eg1;

public class AbcEMS  extends EMS{

	@Override
	public void addEmployee() {
		// TODO Auto-generated method stub
	System.out.println("AbcEmp added to MYSQL DB");	
	}

	@Override
	public void updateEmployee() {
		// TODO Auto-generated method stub
		System.out.println("AbcEmp updated in MYSQL DB");		
	}

	@Override
	public void calculateEmployeeSalary() {
		// TODO Auto-generated method stub
		System.out.println("AbcEmp salary calculated from MYSQL DB");		
	}

	@Override
	public void deleteEmployee() {
		// TODO Auto-generated method stub
		System.out.println("AbcEmp deleted  from MYSQL DB");	
	}

}
