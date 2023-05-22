package output;

public class ABTest {
	
	public static void main(String arg[]) {
		A obja=new A();
		obja.m1();// in a
		B objb=new B();
		objb.m1();//in b
		
		A obj=new B();
		obj.m1();//  in b -->because jo memory derha//  b ka object create horha  // method are not static
		
	
		
		//B obj1=new A();// not give child reference to parent//
	}

}
