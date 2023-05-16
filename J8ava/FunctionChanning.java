import java.util.function.Function;

public class FunctionChanning {
	
	public static void main(String arg[]) {
		Function<Integer, Integer> doubleIt=i->2*i;
		Function<Integer, Integer> cudeIt=i->i*i*i;
		
		System.out.println("Function channing " + doubleIt.andThen(cudeIt).apply(2));
		System.out.println("Function channing " + doubleIt.compose(cudeIt).apply(2));
	}

}
