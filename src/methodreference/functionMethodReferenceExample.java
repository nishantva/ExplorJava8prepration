package methodreference;

import java.util.function.Function;

public class functionMethodReferenceExample {
	
	
	static Function<String,String> toUppercaseLambda =(s)-> s.toUpperCase();
	  static Function <String ,String> toUpperCaseMethodreference= String::toUpperCase;
			
	public static void main(String arg[]) {
		
		System.out.println(toUppercaseLambda.apply("java8"));
		System.out.print(toUpperCaseMethodreference.apply("java8"));
		
	}
	
	

}
