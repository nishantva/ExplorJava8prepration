package Exception;

public class MainThrow {
	
	public static void main(String arg[]) {// there is no parent for main method
		throw new NullPointerException();
	}

}
//java runtimes  terminate the program and print the exception message