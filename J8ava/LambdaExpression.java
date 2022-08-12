package J8ava;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpression {

	
	public static void main(String arg[]) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,56);
		/*
		 * for(int i : list) { System.out.println(i); }
		 */
		
		
		//functional interface
		Consumer<Integer> c=new Consumer<Integer>() {

			
			public void accept(Integer i) {
				// TODO Auto-generated method stub
				
				System.out.println(i);
				
			}
		};
		
		list.forEach(c);//this foe each except consumer object here//
		
		//list.forEach(i->System.out.println(i));
	}
}
