package singeltonPattern;

public class MainSingleton {
	
	public static void main(String arg[]) {
		
		
		SingletonC singletonObject= SingletonC.getInstance();
		
		singletonObject.simpleMethod();
		
        SingletonC singletonObject2= SingletonC.getInstance();
		
		singletonObject.simpleMethod();
	}

}
