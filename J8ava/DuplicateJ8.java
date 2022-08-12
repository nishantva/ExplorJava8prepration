package J8ava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateJ8 {
	
	public static void main(String arg[]) {
		List<Integer> list =Arrays.asList(1,10,202,5,303,3034,404,2,2,2,40,5,1,404);
		
		HashSet<Integer> set= new HashSet<Integer>();
		//find duplicate using java8
		//list.stream().filter(x->!set.add(x)).collect(Collectors.toSet()).forEach(i->System.out.println(i));
		
		List<Integer> uniquelist=list.stream().filter(i->set.add(i)).collect(Collectors.toList());
		
		uniquelist.forEach(i->System.out.println(i));
	}

}
