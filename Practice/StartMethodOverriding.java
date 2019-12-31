package threads_durgasoft;

public class StartMethodOverriding extends Thread{
	public void start() {
		super.start();
		System.out.println("Overloaded: Start Method");
	}
	public void run() {
		System.out.println("Child : Run Method");
	}
}
