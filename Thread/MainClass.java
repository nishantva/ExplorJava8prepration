package Thread;

public class MainClass {
	
	public static void main(String arg[]) {
		
		
		ThreadClass  t=new ThreadClass();
		
		t.start();
		t.start();//can not start the thread allready strated// give illegal thread exception
	}

}
