package threads_telusko;

class Q {
	int num;
	boolean flag;

	public synchronized void put(int num) {
		while(flag) {
			try {wait();} catch(Exception e) {}
		}
		System.out.println("Put: " + num);
		this.num = num;
		flag = true;
		notify();
	}

	public synchronized void get() {
		while(!flag) {
			try {wait();} catch(Exception e) {}
		}
		System.out.println("Get: " + num);
		flag = false;
		notify();
	}
}

class Producer implements Runnable {
	Q q;

	public Producer(Q q) {
		this.q = q;
		Thread t = new Thread(this, "Producer Thread");
		t.start();
	}

	public void run() {
		int i = 0;
		while (true) {
			q.put(i++);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}

class Consumer implements Runnable {
	Q q;

	public Consumer(Q q) {
		this.q = q;
		Thread t = new Thread(this, "Consumer Thread");
		t.start();
	}

	public void run() {
		while (true) {
			q.get();
			try {
				Thread.sleep(5);
			} catch (Exception e) {
			}
		}
	}
}

public class InterThread_Communication {
	public static void main(String[] args) {
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
	}
}
