package threads_durgasoft;

public class RunMethodOverloadingMain {

	public static void main(String[] args) {
		RunMethodOverloading thread = new RunMethodOverloading();
		thread.start();
		
		System.out.println("Main: Parent class");
		
		int i = 0;	
		thread.run(i);
	}

}
