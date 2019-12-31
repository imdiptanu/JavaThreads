package threads_telusko;

public class FirstThread extends Thread {

	int[] values = { 1, 2, 3, 4, 5 };

	public void run() {
		for (int index = 0; index < values.length; index++) {
			values[index] = values[index] * 2;
		}
		for (int index = 0; index < values.length; index++) {
			System.out.println(values[index]);
		}
		
	}

	public static void main(String[] args) {
		Thread t1 = new FirstThread();
		System.out.println("X");
		t1.start();
		System.out.println("X-End");
		
	}
}
