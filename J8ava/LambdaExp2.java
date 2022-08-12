package J8ava;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LambdaExp2 {

	public static void main(String arg[]) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,56);
		
		
		//System.out.println(list.stream().filter(i->i%5==0).map(i->i*2).findFirst().orElse(0));
		
		System.out.println(list.stream().filter(i->i>3).map(i->i*1).findFirst().orElse(0));
		
	Optional<Integer>  last2sum = list.stream().filter(i->i>3).limit(2).reduce((sum,k)->sum+k);
	
	
	System.out.print(last2sum);
	}
}
