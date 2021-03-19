package using_thread_class;

public class MyThread  extends Thread{

	@Override
	public void run() {
	//	System.out.println("hello from "+Thread.currentThread()+" id is "+Thread.currentThread().getId());
		for (int i = 0; i < 5; i++) {
			System.out.println("Printing from thread -> "+Thread.currentThread().getName()+" value of i = "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
