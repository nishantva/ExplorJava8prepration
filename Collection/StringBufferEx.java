package Collection;

public class StringBufferEx {
	
	public static void main(String arg[]) {
		StringBuffer a=new StringBuffer("abc");
		StringBuffer b=new StringBuffer("abc");
		
		if(a.toString().equals(b.toString())) {
			System.out.print("yes");
		}
		if(a==b) {
			System.out.print("this is yes");
		}
		
		
		
	}

}
