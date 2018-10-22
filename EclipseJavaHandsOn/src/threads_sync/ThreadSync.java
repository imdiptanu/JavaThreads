package threads_sync;

public class ThreadSync extends Thread {
	Display d;
	String name;

	public ThreadSync(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.print(name);
	}
}
