package J8ava;

import java.util.Optional;

public class OptionalExample {
	
	
	public static Optional<String> getName(){
		String name="Nishnt";
		return Optional.ofNullable(name);
	}
	
	public static void main(String arg[]) {
		
		String str="nishant";
		
		Optional<String> string=Optional.ofNullable(str);
		
		System.out.println(string.isPresent());
		System.out.println(string.get());
		
		getName();  // whrn e call this method the developer will check the null check by optonal
	}

}
