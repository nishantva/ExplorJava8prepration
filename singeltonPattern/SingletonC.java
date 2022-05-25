package singeltonPattern;

public class SingletonC {
	
	
	private SingletonC() {
		
	}
	
	private static SingletonC  singletonobj=new SingletonC();
	
	
	synchronized public static SingletonC getInstance() {
		
		return singletonobj;
	}
	
	 public void simpleMethod() {
		   System.out.println("hashcode of singelton object" + singletonobj);
	   }

}
