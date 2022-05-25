package String;

public class Change1stCharOfString {
	
	public static void main(String arg[]) {
		String s="my name is";
		
		String arr[]=s.split(" ");
		
	for(int i=0;i<arr.length;i++) {
		char c=arr[i].charAt(0);
		
		String c1=String.valueOf(c).toUpperCase();
		String sub=arr[i].substring(1);
		System.out.print(" "+c1+sub);
		
	}
		
	}

}
