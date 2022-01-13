package lambda;

import java.util.Comparator;

public class ComparatorLambdaExample {
	
	public static void main(String arg[]) {
		
		
		Comparator<Integer> comparator= new Comparator<Integer> () {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o1.compareTo(o2);
			}
			
		
		
	};
	
	System.out.println("result "+ comparator.compare(3, 5));
	
	
	//using java
	Comparator<Integer> comparator1= (Integer a,Integer b)  ->{return  a.compareTo(b);};
	
	System.out.print("result"+comparator1.compare(5, 6) );
	
	
	//or
	Comparator<Integer> comparator2=(a,b)  ->a.compareTo(b);
	
	System.out.println(comparator2.compare(1, 2));
	

}
	
}
