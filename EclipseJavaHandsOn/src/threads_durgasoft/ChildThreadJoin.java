package threads_durgasoft;

public class ChildThreadJoin extends Thread{
	public void run() {
		Thread.currentThread().setName("child");
		for (int index = 0; index < 5; index++) {
			System.out.println("Thread: " + Thread.currentThread().getName() +
					" Index: " + index);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.getMessage();
			}
		}
	}
}
