package J8ava;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Stream5 {
	
	public static void main(String arg[]) {
		
		
		List<Integer> list=new ArrayList<>();
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(8);
		
		
		
	//	Integer min=list.stream().min((i1,i2)  ->i1.compareTo(i2)).get();
		
        Integer  max=list.stream().max((i1,i2)->i1.compareTo(i2)).get();		
		Integer min =list.stream().min((i1,i2)-> i1.compareTo(i2)).get();
		//bydefault assending
		//limit is add for let the starting
		List<Integer> sortlist=list.stream().sorted((i1,i2)->i1.compareTo(i2)).limit(3).collect(Collectors.toList());
		sortlist.forEach(i->System.out.print(i+" "));
		
		
		List<Integer> sortlistuseskip=list.stream().sorted((i1,i2)->i1.compareTo(i2)).skip(3).collect(Collectors.toList());
		
        		
		//System.out.println(max);
		
		//System.out.print(min);
		
		//sorted in desending order
		
		List<Integer> desorder =list.stream().sorted((i1,i2)->i2-i1).collect(Collectors.toList());
		
		
	
		
	}

}
