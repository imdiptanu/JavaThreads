package threads_durgasoft;

public class ChildRunnableMain {
	public static void main(String[] args) {
		ChildRunnable cr = new ChildRunnable();
		Thread thread = new Thread(cr);
		thread.start();
		//thread.run();
		for (int index = 0; index < 5; index++) {
			System.out.println("Main Method");
		}
	}
}
