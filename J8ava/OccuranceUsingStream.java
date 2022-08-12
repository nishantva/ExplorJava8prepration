package J8ava;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccuranceUsingStream {
	
	public static void main(String arg[]) {
		String str="Hi nishant check the. hi there nishant";
		
		
		List<String>  list=Arrays.asList(str.split(" "));
		
	Map<String ,Long>	map=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	System.out.println(map);
	}
//Function.identity()  return the arrgument and then we count that
	
	
}
