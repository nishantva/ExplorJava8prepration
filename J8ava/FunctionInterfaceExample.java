import java.util.function.Function;

public class FunctionInterfaceExample {
	
	public static void main (String arg[]) {
		
		Function<Integer, Integer>  square=i->i*i;
		
		System.out.print("square of 5"+ square.apply(5));
		
	}

}
