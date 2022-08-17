package Exception;

public class CoustomException extends Exception {
	
	
	String str;
	
	CoustomException(String str){
		this.str=str;
		
	}
	
	public String toString() {
		return ("message --->"+str);
		
	}
}
