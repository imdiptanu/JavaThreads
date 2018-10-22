package threads_sync;

public class SyncDisplayThread extends Thread {
	SyncDisplay d;
	String name;

	public SyncDisplayThread(SyncDisplay d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.print(name);
	}
}
