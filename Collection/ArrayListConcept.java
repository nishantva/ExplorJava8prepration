package Collection;

import java.util.ArrayList;
import java.util.Arrays;

import outputQ.Add;

public class ArrayListConcept {
	
	public static void main(String arg[]) {
		ArrayList<Integer> list[]=new ArrayList[5];
		Arrays.fill(list, new ArrayList());
		
		list[0].add(0);
		list[1].add(1);
		list[2].add(2);
		
		System.out.print(list[2].get(2));//
	}

}
