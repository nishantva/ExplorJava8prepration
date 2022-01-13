package Exception;

public class Example {
	
	
	public static void main(String arg[]) {

		//exception simple example
		try {
			String a="null";
			System.out.print(a.charAt(0));
			
		} catch (NullPointerException e) {
			System.out.print("Null pointer exception");
		}
		
		
	}

}
