package threads_durgasoft;

public class ChildThreadYieldMain {

	public static void main(String[] args) {
		ChildThreadYield cty = new ChildThreadYield();
		cty.setName("child");
		cty.start();
		for (int index = 0; index < 5; index++) {
			System.out.println("Thread: " + Thread.currentThread().getName() +
					" Index: " + index);
		}
	}

}
