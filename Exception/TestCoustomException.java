package Exception;

public class TestCoustomException {
	
	public static void main(String arg[]) {
		
		
		try {
			throw new CoustomException("this is the the coustom exception");
		} catch(Exception e){
			System.out.print(e);
		}
	}

}
