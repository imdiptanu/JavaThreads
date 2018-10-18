package threads_telusko;

class Hi extends Thread {
	public void run() {
		for (int index = 0; index < 5; index++) {
			System.out.println("Hi");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}

class Hello extends Thread {
	public void run() {
		for (int index = 0; index < 5; index++) {
			System.out.println("Hello");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) throws Exception {

		Hi objHi = new Hi();
		Hello objHello = new Hello();
		objHi.start();
		objHello.start();
		objHi.join();
		System.out.println("XXX - 1");
		objHello.join();
		System.out.println(objHello.isAlive());
	}
}
