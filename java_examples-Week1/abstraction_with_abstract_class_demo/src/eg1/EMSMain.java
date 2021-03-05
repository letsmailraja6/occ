package eg1;

public class EMSMain {

	public static void main(String[] args) {
		
		System.out.println("Accessing EMS using RevatureEMS");
		EMS ems=new RevatureEMS();
		ems.addEmployee();
		ems.calculateEmployeeSalary();
		ems.updateEmployee();
		ems.commonEmployeeFeature();
		ems.deleteEmployee();
		
		
		System.out.println("\n\nAccessing EMS using AbcEMS");
		EMS ems1=new AbcEMS();
		ems1.addEmployee();
		ems1.calculateEmployeeSalary();
		ems1.updateEmployee();
		ems1.commonEmployeeFeature();
		ems1.deleteEmployee();

	}

}
