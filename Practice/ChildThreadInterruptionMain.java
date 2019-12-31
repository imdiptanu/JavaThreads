package threads_durgasoft;

public class ChildThreadInterruptionMain {

	public static void main(String[] args) {
		// ChildThreadInterruption cti = new ChildThreadInterruption();
		ChildThreadInterruption2 cti = new ChildThreadInterruption2();
		cti.start();
		cti.interrupt();
		System.out.println("Main thread.");
	}

}
