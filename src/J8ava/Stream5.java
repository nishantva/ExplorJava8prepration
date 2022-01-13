package J8ava;

import java.util.ArrayList;
import java.util.List;

public class Stream5 {
	
	public static void main(String arg[]) {
		
		
		List<Integer> list=new ArrayList<>();
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(8);
		
		
		Integer max=list.stream().max((i1,i2)  ->i1.compareTo(i2)).get();
		
		Integer min=list.stream().min((i1,i2)  ->i1.compareTo(i2)).get();
		System.out.println(max);
		
		System.out.print(min);
		
	}

}
