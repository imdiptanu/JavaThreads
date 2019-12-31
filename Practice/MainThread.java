package threads_durgasoft;

public class MainThread {

	public static void main(String[] args) {
		ChildThread cT = new ChildThread();
		cT.start();
		//cT.run(); // This without cT.start() would not create a new
		// thread so, only main thread would run and executed normally.
		for (int index = 0; index < 10; index++) {
			System.out.println("Main Thread");
		}
	}

}
