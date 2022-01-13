package String;

public class Test2 {
	public static void main(String arg[]) {
		
		String s="ABDEFGABEF";
		int n=s.length();
		char arr[]= s.toCharArray();
		for(int i=n-1;i>=0;i--) {
	   System.out.print(arr[i]);
		}
		
	}

}
