package J8ava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Stream8Flatmap {

	
	public static void main(String arg[]) {
		HashMap<String,List<String>> data=new HashMap<>();
		data.put("car", Arrays.asList("toyota", "bmw", "honda"));
		data.put("fruit", Arrays.asList("apple","banana"));
		data.put("computer", Arrays.asList("acer","asus","ibm"));
		
		List<String >  out=data.values()
		   .stream()
		   .flatMap(list -> list.stream())
		   .collect(Collectors.toList());
		
		System.out.print(out);
	}
}
