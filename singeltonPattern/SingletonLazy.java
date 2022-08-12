package singeltonPattern;

public class SingletonLazy {
private SingletonLazy() {
		
	}
	
	private static SingletonLazy  singletonobj=null;
	
	
	
	 public static SingletonLazy getInstance() {//
		if(singletonobj==null) {
			singletonobj =new SingletonLazy();
		}
		return singletonobj;
	}
	


}
