package threads_sync;

public class ThreadSyncMain {

	public static void main(String[] args) {
		Display d = new Display();
		Display d1 = new Display();
		ThreadSync ts1 = new ThreadSync(d, "Diptanu");
		ThreadSync ts2 = new ThreadSync(d1, "Saikat");
		
		ts1.start();
		ts2.start();
	}

}
