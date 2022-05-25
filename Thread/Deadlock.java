package Thread;

public class Deadlock extends Thread {
	
	public static void main(String arg[]) {
		Deadlock d=new Deadlock();
		d.m1();
		
	}
	
	public void m1() {
		m2();
		System.out.print("iii");
		
	}
	public void m2() {
		m1();
		System.out.print("iii");
		
	}

}
