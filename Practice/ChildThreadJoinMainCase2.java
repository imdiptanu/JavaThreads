package threads_durgasoft;

public class ChildThreadJoinMainCase2 {

	public static void main(String[] args) throws InterruptedException {
		ChildThreadJoinCase2.mainThead = Thread.currentThread();
		ChildThreadJoinCase2 ctj = new ChildThreadJoinCase2();
		ctj.start();
		// ctj.join(); // <---- Deadlock, one thread is waiting for another. ** Case 3 **
		for (int index = 0; index < 5; index++) {
			System.out.println("Thread: " + Thread.currentThread().getName() + " Index: " + index);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.getMessage();
			}
		}
	}

}