package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FailFastEx {
	
	
	public static void main (String arg[]) {
		
		Set<Integer> hset=new HashSet<Integer>();
		
		hset.add(1);
		hset.add(2);
		hset.add(3);
		hset.add(4);
		hset.add(5);
		
		Iterator<Integer> it=hset.iterator();
		
		while(it.hasNext()) {
			hset.remove(3);
			hset.add(5);
			System.out.print(it.next());
			
		}
	}

}
