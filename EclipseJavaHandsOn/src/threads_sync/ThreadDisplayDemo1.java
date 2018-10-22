package threads_sync;

public class ThreadDisplayDemo1 extends Thread{
	DisplayDemo display;
	public ThreadDisplayDemo1(DisplayDemo display) {
		this.display = display;
	}
	public void run() {
		display.displayD();
	}
}
