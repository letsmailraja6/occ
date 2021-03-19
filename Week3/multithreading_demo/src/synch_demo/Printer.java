package synch_demo;

public class Printer {

	public synchronized static void printPages(Pages pages) {
		
		System.out.print(pages.getPage1());
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" "+pages.getPage2());
	}
}
