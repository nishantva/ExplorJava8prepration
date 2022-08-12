package J8ava;

import java.util.stream.Stream;

public class ParallelStreamDemo {
	
	
	public static void main(String arg[]) {
		
		Stream.of(1,11,1111,11111).forEach(x->System.out.println(x));
	}

}
