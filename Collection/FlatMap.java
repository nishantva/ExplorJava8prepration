package Collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
	
	public static void main(String arg[]) {
		List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11,13);
        
        // Creating a list of Odd Numbers
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5);
          
        // Creating a list of Even Numbers
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);
        
        List<List<Integer>>  listoflist = Arrays.asList(PrimeNumbers,OddNumbers,EvenNumbers);
        
        System.out.println(listoflist);
        
     List<Integer> flatmaplist=  listoflist.stream().flatMap(i->i.stream()).collect(Collectors.toList());
        
        System.out.print(flatmaplist);
	}

}
