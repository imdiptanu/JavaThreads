package threads_durgasoft;

public class ChildThread extends Thread {
	public void run() {
		for (int index = 0; index < 10; index++) {
			System.out.println("Child Thread");
		}
	}
}
