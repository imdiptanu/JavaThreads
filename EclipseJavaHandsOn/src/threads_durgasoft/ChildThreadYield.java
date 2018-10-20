package threads_durgasoft;

public class ChildThreadYield extends Thread {
	public void run() {
		for (int index = 0; index < 5; index++) {
			System.out.println("Thread: " + Thread.currentThread().getName() +
					" Index: " + index);
			Thread.yield();
		}
	}
}
