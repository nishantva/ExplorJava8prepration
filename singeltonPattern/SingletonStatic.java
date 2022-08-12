package singeltonPattern;
//static intalization
public class SingletonStatic {
	
private SingletonStatic() {
		
	}
	
	private static SingletonStatic  singletonobj=null;
	
	static {
		try {
			if(singletonobj==null) {
				singletonobj =new SingletonStatic();
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static SingletonStatic getInstance() {//
		
		return singletonobj;
	}
	
	 public void simpleMethod() {
		   System.out.println("hashcode of singelton object" + singletonobj);
	   }

}

