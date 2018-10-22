package threads_sync;

public class ThreadDisplayDemo2 extends Thread{
	DisplayDemo display;
	public ThreadDisplayDemo2(DisplayDemo display) {
		this.display = display;
	}
	public void run() {
		display.displayC();
	}
}
