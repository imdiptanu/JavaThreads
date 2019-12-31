package threads_sync;

public class ThreadDisplayDemoMain {

	public static void main(String[] args) {
		DisplayDemo display = new DisplayDemo();
		ThreadDisplayDemo1 tdd1 = new ThreadDisplayDemo1(display);
		ThreadDisplayDemo2 tdd2 = new ThreadDisplayDemo2(display);
		tdd1.start();
		tdd2.start();
		
		// Case - I: Both methods are notmal -> non static, non sync
		//		   : O/p: Irregular
		
		// Case - II: Both methods are notmal -> non static, non sync
		//		    : O/p: Regular
	}

}
