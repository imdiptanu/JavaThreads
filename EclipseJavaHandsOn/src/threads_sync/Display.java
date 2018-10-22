package threads_sync;

public class Display {
	public void print(String name) {
		for (int index = 0; index < 10; index ++) {
			System.out.print("Name: ");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			System.out.println(name);
		}
	}
}
