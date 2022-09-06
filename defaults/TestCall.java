package defaults;

public class TestCall  implements A,B {
	
	public static void main(String arg[]) {
	 
		
		TestCall obj=new TestCall();
		
		obj.methodcall();
	
	}

	@Override
	public void methodcall() {
		// TODO Auto-generated method stub
		B.super.methodcall();
	}

	
}
