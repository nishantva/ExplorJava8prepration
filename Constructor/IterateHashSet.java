package Constructor;

import java.util.HashSet;
import java.util.Iterator;

public class IterateHashSet {
	
	public static void main(String arg[]) {
		HashSet<Integer> set=new HashSet<Integer>();
		set.add(4);
		set.add(5);
		   
		   Iterator<Integer> it = set.iterator();
		   
		   
		   while(it.hasNext()) {
			   System.out.println(it.next());
		   }
		   
		   
		   
		   
		
	}

}
