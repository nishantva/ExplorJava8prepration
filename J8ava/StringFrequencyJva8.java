package J8ava;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringFrequencyJva8 {
	public static void main(String arg[]) {
		
		List<String> str=Arrays.asList("Nishant","rahul","Nishant","rr","vv","rr");
		
		Map<String, Long> map= str.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		
		map.forEach((k,v)->System.out.println(k+"--->"+v));
		
		
	}

}
