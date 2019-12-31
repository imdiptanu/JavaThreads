package threads_sync;

public class DisplayDemo {
	public static synchronized void displayD() {
		for (int index = 0; index < 10; index ++) {
			System.out.println(index);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public  static synchronized void displayC() {
		for (int index = 65; index < 76; index ++) {
			System.out.println((char)index);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
