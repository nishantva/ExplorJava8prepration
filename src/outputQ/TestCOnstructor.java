package output;

public class TestCOnstructor {
	
	private TestCOnstructor(int w) {
		System.out.print(w);
		
	}
	public final TestCOnstructor(10) { // constuctor not be final//
		System.out.print(10);
		
	}
	
	public static void main(String arg[]) {
		TestCOnstructor obj=new TestCOnstructor(50);
	}

}
