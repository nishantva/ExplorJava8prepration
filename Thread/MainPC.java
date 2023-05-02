package Thread;

public class MainPC {
	
	public static void main(String arg[]) {
		Company comp=new Company();
		Producer  p=new Producer(comp);
		Consumer c=new Consumer(comp);
		p.start();
		c.start();
	}

}
