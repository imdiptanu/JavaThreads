package threads_durgasoft;

public class ChildThreadJoinCase2 extends Thread {
	static Thread mainThead;

	public void run() {
		Thread.currentThread().setName("child");
		try {
			mainThead.join();
		} catch (InterruptedException e) {
			e.getMessage();
		}
		for (int index = 0; index < 5; index++) {
			System.out.println("Thread: " + Thread.currentThread().getName() + " Index: " + index);
		}
	}
}
