package using_runnable_interface;

public class RunMain {

	public static void main(String[] args) {
		
		RunnableThread r1=new RunnableThread();
		RunnableThread r2=new RunnableThread();
		RunnableThread r3=new RunnableThread();
		RunnableThread r4=new RunnableThread();
		RunnableThread r5=new RunnableThread();
		RunnableThread r6=new RunnableThread();
		
		Thread t1=new Thread(r1, "run-1");
		Thread t2=new Thread(r2, "run-2");
		Thread t3=new Thread(r3, "run-3");
		Thread t4=new Thread(r4, "run-4");
		Thread t5=new Thread(r5, "run-5");
		Thread t6=new Thread(r6, "run-6");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		
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
