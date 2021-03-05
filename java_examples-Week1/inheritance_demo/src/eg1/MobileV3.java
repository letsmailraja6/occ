package eg1;

public class MobileV3 extends MobileV2{

	public void camera() {
		System.out.println("Click pictures record videos from V3 of Mobile");
	}
	
	public void socialApp() {
		System.out.println("Social Networking aps from V3");
	}
	
	public void browsing() {
		System.out.println("Browse internet from V3");
	}
	
	public MobileV3() {
		// TODO Auto-generated constructor stub
		System.out.println("V3");
	}
	
	@Override
	public void displayMenu() {
		System.out.println("Menu form V3 of mobile is upgraded to GRID view");
	}
}
