package outputQ;


class Demo{
	
	private final  void callme() {
		System.out.print("Demo");
	}
}

public class Test2 {
	
	
	public final void callme() {
		System.out.print("Test2");
	}
	
	  public static void main(String[] args) {
		  
		  
		  new Test2().callme();
		  
		  
		  
	  }

}
