package threads_sync;

public class SyncDisplay {
	public void print(String name) {

		// Millions line of codes - But want sync only on for loop.
		// synchronized (this) { // <- Object level lock
		synchronized (SyncDisplay.class) {
			for (int index = 0; index < 10; index++) {
				System.out.print("Name: ");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
				System.out.println(name);
			}
		}
		// Millions line of codes
	}
}
