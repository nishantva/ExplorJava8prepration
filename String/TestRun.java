package String;

public class TestRun {
	
	public static void main(String arg[]) {
		String s="my name is";
		
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++) {
		char c=str[i].charAt(0);
         String c1=String.valueOf(c).toUpperCase();
         String s1=str[i].substring(1);
         
         System.out.print(" "+c1+s1);
		
		}

}
	
	
}
