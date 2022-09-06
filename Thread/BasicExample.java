package Thread;

public class BasicExample extends Thread {
	
		public void run(){  
		System.out.println("thread is running...");  
		}  
		public static void main(String args[]){  
			BasicExample t1=new BasicExample();  
		t1.start();  
		 
		}  

}
