package Collection;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetTestNull {
	
	public static void main(String arg[]) {
		HashSet<Integer> set=new HashSet<Integer>();  //O1
		set.add(null);//null insertion allow..
		set.add(1);
		System.out.print(set);
		
		TreeSet<Integer> Treeset=new TreeSet<Integer>(); //Olong n
		Treeset.add(null);//null insertion notallow..give null pointer exception
		//Treeset.add(1);
		System.out.print(Treeset);
	}

}
