     package String;

public class Removetheajacent {
	
	public static void main(String arg[]) {
		
		String s="abbbacedff";
		
		StringBuffer  sc=new StringBuffer(s);
		
		for(int i=1;i<sc.length();i++) {
			int before=i-1;
			int current=i;
			
			if(sc.charAt(before) == sc.charAt(current)){
				sc.delete(before, current+1);
				
			}
		}
		System.out.print(sc);
		
	}

}
