package J8ava;

import java.util.Arrays;
import java.util.List;

public class LambdaExp2 {

	public static void main(String arg[]) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,56);
		
		
		System.out.println(list.stream().filter(i->i%5==0).map(i->i*2).findFirst().orElse(0));
	}
}
