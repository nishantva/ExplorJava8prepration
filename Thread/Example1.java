package Thread;

class Hii extends Thread {
	

		public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("hii");
			
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 
			
		}
	}

}

class Hello extends Thread {
	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println("hello");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Example1  {

	public static void main(String arg[]) {
		Hii hi = new Hii();

		Hello hello = new Hello();
		
	hi.start();
	hello.start();

	}

}
