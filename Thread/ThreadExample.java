package Thread;

import org.omg.PortableServer.THREAD_POLICY_ID;

public class ThreadExample  implements Runnable{
	
	
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
	public static void main(String arg[]) {
		ThreadExample  t1=new ThreadExample();
		Thread  thr=new Thread(t1);
		thr.start();
		
		
	}

}
