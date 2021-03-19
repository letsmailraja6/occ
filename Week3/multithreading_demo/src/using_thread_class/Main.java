package using_thread_class;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread());
		
		Thread t=Thread.currentThread();
		t.setName("myMain");
		t.setPriority(8);
		
		System.out.println(Thread.currentThread());
		
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		MyThread t3=new MyThread();
		MyThread t4=new MyThread();
		MyThread t5=new MyThread();
		MyThread t6=new MyThread();

		t1.setName("my-1");
		
		t2.setName("my-2");
		t3.setName("my-3");
		t4.setName("my-4");
		t5.setName("my-5");
		t6.setName("my-6");
		t6.setPriority(9);
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
