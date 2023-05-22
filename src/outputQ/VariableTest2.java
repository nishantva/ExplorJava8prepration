package output;

public class VariableTest2 {
	int a=10;
	
	public static void main(String arg[]) {
		VariableTest2  ex;   //yhe  reference variable haiagr comple object hota tho object creation pe varibale 
		//load hota kuki vo ek instance variable hai//
		
		System.out.print(ex.a);
		
		VariableTest2 obj=new VariableTest2();
		
		System.out.print(obj.a);
		
	//	Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		//	The local variable ex may not have been initialized
	}

}
