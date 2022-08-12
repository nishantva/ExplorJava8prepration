package J8ava;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Stream7 {
	
	public static void main(String arg[]) {
		
		List<Integer> list= Arrays.asList(2,4,5,6);
		
      Optional<Integer> opt=list.stream().filter(i->i>=3).map(i->i*i).reduce((sum,k)->sum+k);
		
		
		
		System.out.print(opt);
	}

}
