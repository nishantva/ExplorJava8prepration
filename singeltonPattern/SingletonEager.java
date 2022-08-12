package singeltonPattern;

public class SingletonEager  {
	
	// this is the example of eager initialization  with thread safe by using synchronized key word
	private SingletonEager() {
		
	}
	
	private static SingletonEager  singletonobj=new SingletonEager();
	
	
	synchronized public static SingletonEager getInstance() {//
		
		return singletonobj;
	}
	
	 public void simpleMethod() {
		   System.out.println("hashcode of singelton object" + singletonobj);
	   }

}
