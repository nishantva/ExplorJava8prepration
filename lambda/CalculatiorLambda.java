package lambda;


public abstract  class CalculatiorLambda  implements  Calculator {
	
	public static void main(String arg[]) {
		
		
		
		
	
/*	@Override
	public void switchOn() {
                                // normal way
		
		
		System.out.print("switch on");
	}*/
	
	Calculator calculator=()->System.out.print("yes switch on");
	
	calculator.switchOn();


}
}