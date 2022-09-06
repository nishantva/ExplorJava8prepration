package Collection;

import java.util.HashMap;
//important
public class HasMapInterview {
	
	public static void main(String arg[]) {
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer> ();
		
		map.put(2, 101);
		map.put(2, 102);
		map.put(2, 103);
		map.put(2, 104);
		
		
		System.out.println(map.get(2));// value is overide when we  add with the same key
		System.out.println(map.size());
	}

}
