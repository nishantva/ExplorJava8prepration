package J8ava;

public class MethodReferenceexp {
	
	
public static void main(String arg[]) {
	
	Thread t=new Thread(MethodReferenceexp::printMessage);//this is method reference 
	
	
}
public static void printMessage() {
	System.out.print("Hello");
}
}
