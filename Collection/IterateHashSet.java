package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class IterateHashSet {
	public static void main(String[] args)
    {
        // Creating a new HashSet for iteration
        HashSet<Integer> set = new HashSet<>();
  
        // Add data to HashMap
        set.add(10);
        set.add(20);
  
        // Duplicates not allowed in HashMap, so avoid by
        // HashMap
        set.add(10);
        set.add(50);
  
        // Duplicates not allowed in HashMap, so avoid by
        // HashMap
        set.add(50);
        
        
        Iterator<Integer> it = set.iterator();
        
        while(it.hasNext()) {
        	System.out.print(it.next()+" ");
        }
        
    }

}
