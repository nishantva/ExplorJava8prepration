package Collection;

import java.util.ArrayList;
import java.util.List;

public class FinalWithCollection {
	public static void main(String arg[]) {
		final List<String > list =new ArrayList<>();
		
		list.add("a");
		list.add("b");
		System.out.println(list.size());
		
		//ok to use final in list
		
		System.out.println(list);
		//list= new ArrayList<>();// initalization is not possible
	}

}
