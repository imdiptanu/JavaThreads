package my_codes;

public class ForLoopThreadMain {

	public static void main(String[] args) throws InterruptedException {
		
		ForLoopThread t1 = new ForLoopThread(0, 5);
		ForLoopThread t2 = new ForLoopThread(5, 10);
		long startTime = System.currentTimeMillis();
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Time lapsed: " + (System.currentTimeMillis() - startTime));
	}

}
