import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreampSorthashMap {
	public static void main(String arg[]) {
		HashMap<String,Integer> map=new HashMap<String,Integer> ();
		
		
		map.put("A", 100);
		map.put("B", 200);
		map.put("C", 300);
		map.put("D", 400);
		map.put("E", 500);
		map.put("F", 600);
		//map.entrySet()   not take any parameter and return the set view of hash map//
		//2nd largetest
		Map.Entry<String,Integer>  result=map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList()).get(1);
		
		
		System.out.println(result);
		
		
		// for reverse order
		
		Map.Entry<String, Integer>  result1=map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toList()).get(1);
		//System.out.println(result1);
	//	

		
	}

}
