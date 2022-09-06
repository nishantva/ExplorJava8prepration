package defaults;


interface TestInterface1
{
    // default method
    default void show()
    {
        System.out.println("Default TestInterface1");
    }
}
  
interface TestInterface2
{
    // Default method
    default void show()
    {
        System.out.println("Default TestInterface2");
    
    }
    
    static void play() {
    	System.out.print("this is final implemenentaion");
    }
}


 public class Test1 implements TestInterface1, TestInterface2 {
	 
	
	
	@Override
	public void show() {
		TestInterface1.super.show();
		
		//TestInterface2.super.show();
	}

	public static  void main(String arg[]) {
		
		Test1 d = new Test1();
        d.show();
        
        TestInterface2.play();
	}

	
		
	}



