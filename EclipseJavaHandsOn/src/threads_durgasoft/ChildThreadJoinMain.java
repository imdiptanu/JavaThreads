package threads_durgasoft;

public class ChildThreadJoinMain {

	public static void main(String[] args) throws InterruptedException {
		ChildThreadJoin ctj = new ChildThreadJoin();
		ctj.start();
		//ctj.join();
		//ctj.join(500);
		for (int index = 0; index < 5; index++) {
			System.out.println("Thread: " + Thread.currentThread().getName() +
					" Index: " + index);
		}
	}

}
