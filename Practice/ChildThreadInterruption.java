package threads_durgasoft;

public class ChildThreadInterruption extends Thread {
	public void run() {
		try {
			for (int index = 0; index < 5; index++) {
				System.out.println("I'm a lazy thread.");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}

class ChildThreadInterruption2 extends Thread {
	public void run() {
		for (int index = 0; index < 10; index++) {
			System.out.println("I'm a lazy thread.");
		}
		System.out.println("I want to sleep");
		try {
			System.out.println("I'm going to sleep.");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}