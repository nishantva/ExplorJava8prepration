package J8ava;

import java.util.HashMap;

public class ExampleForEach2 {
	public static void main(String arg) {
		
		HashMap<Integer,String> map =new HashMap<Integer,String> ();
		
		
		map.put(0, "sham");
		map.put(1, "ram");
		map.put(2, "xyz");
		map.put(3, "sham");
		
		map.forEach((k,v)->System.out.print(k+","+v));
		
	}

}
