package ThreadsLearning;

public class ThreadNaming extends Thread {

	public void run() {
//		Thread.sleep(1000);
		System.out.println("running...");
	}

	public static void main(String args[]) {
		ThreadNaming t1 = new ThreadNaming();
		ThreadNaming t2 = new ThreadNaming();
		System.out.println("Name of t1:" + t1.getName());
		System.out.println("Name of t2:" + t2.getName());

		t1.start();
		t2.start();

		t1.setName("Sonoo Jaiswal");
		System.out.println("After changing name of t1:" + t1.getName());
	}

}
