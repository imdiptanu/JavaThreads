package threads_durgasoft;

class ChildThreadName implements Runnable {
	public void run() {
		Thread.currentThread().setName("The child thread");
		System.out.println("This process is executed by thread name: " + Thread.currentThread().getName());
	}
}

public class ThreadName {

	public static void main(String[] args) {
		ChildThreadName ctn = new ChildThreadName();
		Thread t = new Thread(ctn, "Child Thread - name set from Main");
		t.start();
		Thread.currentThread().setName("The main thread");
		System.out.println("This process is executed by thread name: " + Thread.currentThread().getName());
	}

}
