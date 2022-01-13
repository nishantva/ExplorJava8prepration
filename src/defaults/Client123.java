package defaults;

public class Client123 implements Interface2,Interface3,Interface1 {
	
	
	public void methodA() {// overriding the default method in implemented class
		System.out.println("inside a methodA "+Client123.class);
	}
	
	
	public static void main(String arg[]) {
		Client123 client123=new Client123();
		client123.methodA();
		client123.methodB();
		client123.methodC();
		
	}

}
