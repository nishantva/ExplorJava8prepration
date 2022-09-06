package Constructor;

import java.util.HashMap;

public class MapExample {
	
	public static void main(String arg[]) {
		HashMap<String,String> map=new HashMap<String,String>();
		
		map.put("a", "20");
		map.put("b", "10");
		map.put("c", "30");
		map.put("a", "20");
		
		//System.out.print(map);
		
		
		for(String key : map.keySet()) {
			
			System.out.print(key);
			
		}
	}

}
