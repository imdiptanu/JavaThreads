package threads_telusko;

class Counter {
	int count;

	public synchronized void increment() {
		count++;
	}
}

public class Sync_Demo {

	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
		Thread t1 = new Thread(new Runnable() {

			public void run() {
				for (int index = 0; index < 1000; index++) {
					c.increment();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {

			public void run() {
				for (int index = 0; index < 1000; index++) {
					c.increment();
				}
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(c.count);

	}
}
