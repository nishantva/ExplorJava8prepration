package Collection;

import java.util.HashMap;
import java.util.Map;

public class IterateHashMap {

	
	public static void main(String arg[]) {
	    Map<String,String> map = new HashMap<String,String>();
	     
        // enter name/url pair
	    map.put("GFG", "geeksforgeeks.org");
	    map.put("Practice", "practice.geeksforgeeks.org");
	    map.put("Code", "code.geeksforgeeks.org");
	    map.put("Quiz", "quiz.geeksforgeeks.org");
        
        
        map.forEach((k,v)->System.out.println("k is="+ k  + "value=" +v));
	}
}
