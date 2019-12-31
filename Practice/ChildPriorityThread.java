package threads_durgasoft;

public class ChildPriorityThread extends Thread {
	public void run() {
		for (int index = 0; index < 5; index++) {
			System.out.println("Priority: " + Thread.currentThread().getPriority() + " Name: "
					+ Thread.currentThread().getName() + " Index: " + index);
		}
	}
}
