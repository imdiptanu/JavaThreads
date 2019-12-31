package threads_telusko;

class HiRun implements Runnable {
	public void run() {
		for (int index = 0; index < 5; index++) {
			System.out.println("Hi");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
	}
}

class HelloRun implements Runnable {
	public void run() {
		for (int index = 0; index < 5; index++) {
			System.out.println("Hello");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class Thread_Runnable {

	public static void main(String[] args) {

		Hi objHi = new Hi();
		Hello objHello = new Hello();

		Thread t1 = new Thread(objHi, "Hi Thread");
		Thread t2 = new Thread(objHello, "Hello Thread");

//		System.out.println(t1.getName());
//		t1.setName("Chnaged Hi");
//		System.out.println(t1.getName());
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
		}
		t2.start();
		System.out.println();
	}
}