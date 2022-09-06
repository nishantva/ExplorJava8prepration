package GarbageCollectorDemo;

public class GarbageCollector {
	
	public static void main(String arg[]) {
		
		
		GarbageCollector obj =new GarbageCollector();
		obj=null;
		
		
      //system.gc
		Runtime.getRuntime().gc();
		
		System.out.println("the main method is done");
		
	}
	
	
	@Override
	protected void finalize()  throws Throwable{
		
		System.out.print("Finalized method is called");
	}

}
