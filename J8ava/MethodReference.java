package J8ava;



interface Sayable{
	void say(String s);
}


public class MethodReference {
	
	
	public static void saySomething(String s) {
		System.out.println("tell me something"+s);
		
	}
	
	public static void main(String arg[]) {
		
		//refering static method
		
		Sayable sayable= MethodReference::saySomething;
		
		sayable.say("Nisant");
		
	}
	

}
