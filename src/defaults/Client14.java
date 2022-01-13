package defaults;

public class Client14  implements Interface1,Interface4{

	public void methodA() {
	System.out.print("Inside methodA  "+Client14.class );
	
}
	
public static void main(String arg[]) {
	Client14 client14=new Client14();
	
	client14.methodA();
	
}
}
