package output;

public class VariableTest {
	
	
	private int x;
	
	private static int y;
	
	public static void main(String arg[]) {
	//	System.out.print(x);  not able to access the non sttaic form static method
		
		int z;//by default blank hoga//
		
	//	static int p;// static local variable not allow//
		VariableTest obj =new VariableTest();
		System.out.println(obj.x);
		System.out.println(y);// print zero default value
		
	//	System.out.println(z); // not possible to print bina value k  null nahi hoga kuki null bs reference 
		// variable k hote hai
	}

}
