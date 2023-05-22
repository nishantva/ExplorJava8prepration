package output;

public class OverloadingTest {
	
	public static void main(String arg[]) {
	
	}
	public   int add(int a,int b) {
		  System.out.print("hiii");
		  
		  return 1;
	  }
	
	public   int add(int a,int b,int c) {
		return 1;
	}
	
	public   String addS(int a,int b) {
		  System.out.print("hiii");
		  
		  return "dd";
	  }
}
