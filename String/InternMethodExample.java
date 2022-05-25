package String;

public class InternMethodExample {
	
	public static void main(String arg[]) {
		
		String s1="Code";
		String s2=new String("Code");
		
		String s3=s2.intern();//intern //returns string from pool
		
		System.out.println(s3==s1);
		System.out.println(s3==s2);
		
		String str = new String("Welcome to JavaTpoint").intern(); // statement - 1  
		String str1 = new String("Welcome to JavaTpoint").intern(); // statement - 2  
		System.out.println(str1 == str); // prints true  
		
	}

}
