package threads_durgasoft;

public class ChildThreadJoinMainCase4 {

	public static void main(String[] args) throws InterruptedException {
		Thread.currentThread().join(); // <-- Deadlock
		System.out.println("Main Thread");
	}

}
