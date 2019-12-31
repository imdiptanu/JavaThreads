package threads_sync;

public class SyncDisplayThreadMain {

	public static void main(String[] args) {
		SyncDisplay sc1 = new SyncDisplay();
		SyncDisplay sc2 = new SyncDisplay();
		SyncDisplayThread thread1 = new SyncDisplayThread(sc1, "Diptanu");
		SyncDisplayThread thread2 = new SyncDisplayThread(sc2, "Dollar");
		thread1.start();
		thread2.start();
	}

}
