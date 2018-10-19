package threads_durgasoft;

public class ChildRunnable implements Runnable {

	public void run() {
		for (int index = 0; index < 5; index++) {
			System.out.println("Child Method");
		}
	}
}
