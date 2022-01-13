package J8ava;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {
	
	public static void main(String arg[]) {
		
		List<String> keyword =Arrays.asList("Apple","mango","orange","cherry","mango","apple");
		//maping by word
		Map<String,List<String>> map=keyword.stream().collect(Collectors.groupingBy((word->word)));
		
		//System.out.print(map);
		
		
		List<String>  uppercase= keyword.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		//System.out.println(uppercase);
		
		
		// print the length of every element in the map
		
		keyword.stream().map(str ->str.length()).forEach(i->System.out.println(i));
		
		// flatmap exmaple
		
		
		
	}

}
