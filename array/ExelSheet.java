package array;
//Find Excel column name from a given column number
public class ExelSheet {
	
	public static void main(String arg[]) {
		String result="";
		int n=26;
		while(n>0) {
			char c=(char) ('A'+(n-1) % 26);
			
			result=c+result;
			n= (n-1)/26;
			
		}
		
		System.out.print(result);
	}

}
