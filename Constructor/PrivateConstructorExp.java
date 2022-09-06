package Constructor;

public class PrivateConstructorExp {
	
	
		
		 private PrivateConstructorExp() {
			 System.out.print("hiii ");
			 
		 }
		

		 private PrivateConstructorExp(int n) {
			 System.out.print("hiii222 ");
		 }
		
		 
		 public static void main(String arg[]) {
			 PrivateConstructorExp exp=new PrivateConstructorExp();
			 PrivateConstructorExp exp1=new PrivateConstructorExp(1);
	
			
			 
		 }

}
