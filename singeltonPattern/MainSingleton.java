package singeltonPattern;

public class MainSingleton {
	
	public static void main(String arg[]) {
		
		
		SingletonEager singletonObject= SingletonEager.getInstance();
		
		singletonObject.simpleMethod();
		
		SingletonEager singletonObject2= SingletonEager.getInstance();
		
		singletonObject.simpleMethod();
	}

}
