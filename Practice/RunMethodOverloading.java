package threads_durgasoft;

public class RunMethodOverloading extends Thread {
	public void run() {
		System.out.println("No Args : Child Thread");

	}

	public void run(int i) {
		System.out.println("With Args : Child Thread");
	}
}
