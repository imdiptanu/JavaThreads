package threads_durgasoft;

public class StartMethodOverridingMain {

	public static void main(String[] args) {
		StartMethodOverriding thread = new StartMethodOverriding();
		thread.start();
		System.out.println("Main method");
		thread.start();
	}

}
/* Only 3 possibilities are there - 

1. 
Child : Run Method
Overloaded: Start Method
Main method

2. 
Overloaded: Start Method
Main method
Child : Run Method

3.
Overloaded: Start Method
Child : Run Method
Main method

*/