package threads_durgasoft;

public class ThreadPriority {

	public static void main(String[] args) {
		System.out.println("Default main thread priority: " + 
									Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(7); 
		// Comment this line and check the o/p.
		// Main thread has default priority of 5. 
		// Rest all the threads inherits the parent thread priority.
		System.out.println("Updated main thread priority: " + 
									Thread.currentThread().getPriority());
		Thread thread = new Thread();
		System.out.println("Child thread priority: " + thread.getPriority());
	}
}
