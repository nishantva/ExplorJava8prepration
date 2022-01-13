package J8ava;

import java.util.Arrays;
import java.util.List;

public class ParallelStream {
	
	public static void main(String aef[]) {
		
		
		List<Integer> list= Arrays.asList(1,2,3,4,5,6);
		
		list.stream().parallel().forEachOrdered(System.out::println);// of corrent order we use ordered here
	}

}
