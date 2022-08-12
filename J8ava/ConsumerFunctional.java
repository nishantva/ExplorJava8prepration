package J8ava;

import java.util.function.Consumer;

public class ConsumerFunctional {

	public static void main (String arg[]) {
		
		Consumer<String> exp= input->System.out.println(input.toUpperCase());
		
		
		exp.accept("exmaple to consumer functional interface");
	
	}
}
