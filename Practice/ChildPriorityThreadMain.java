package threads_durgasoft;

public class ChildPriorityThreadMain {
	public static void main(String[] args) {
		ChildPriorityThread cpt = new ChildPriorityThread();
		cpt.setPriority(10);
		cpt.start();
		for (int index = 0; index < 5; index++) {
			System.out.println("Priority: " + Thread.currentThread().getPriority() + " Name: "
					+ Thread.currentThread().getName() + " Index: " + index);
		}
	}
}
