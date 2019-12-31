package my_codes;

public class ForLoopThread extends Thread {
	private int start;
	private int end;

	public ForLoopThread(int start, int end) {
		this.start = start;
		this.end = end;
	}

	public void run() {
		try {
			loop();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

	public void loop() throws InterruptedException {

		for (int index = start; index < end; index++) {
			System.out.println("Index:" + index);
			Thread.sleep(600);
		}
	}
}
