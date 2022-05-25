package String;

public class Test5 {
	public static void main(String arg[]) {
		
		String s1=new String("code");// 2 object is created one in heap and one is string pool
		
		String s2=new String("code");//1 object is created only in heap memory
	}


}
