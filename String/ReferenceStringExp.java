package String;

public class ReferenceStringExp {
	public static void main(String arg[]) {
		
		String str= new String("nishnat");
		String str1=str;
		
		str="vaishla";
		
		System.out.println(str);
		
		// proff string is immutable//
		  String s1= "code";
		  System.out.println(s1.hashCode());
		  
		   s1= s1+ "java";
		   System.out.println(s1.hashCode());
	}

}
