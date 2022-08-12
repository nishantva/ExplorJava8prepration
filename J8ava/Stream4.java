package J8ava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream4 {
	public static void main(String arg[]) {
		ArrayList<Integer> i=new ArrayList<>();
		i.add(2);
		i.add(3);
		i.add(4);
		i.add(5);
		
		Stream s =i.stream().filter(x->x%2==0);
		//s.forEach(y->System.out.print(y+" "));
		
		//List<Integer>
		
		//map implement
		
		//i.stream().map(x->x*2).forEach(x ->System.out.println(x));
		List<Integer> listtest = i.stream().map(x->x*2).collect(Collectors.toList());
		List<Integer> remove4=i.stream().filter(y->y==4).collect(Collectors.toList());
		
		for(int p=0;p<listtest.size();p++) {
			System.out.print(listtest.get(p)+" ");
		}
		
		
	}

}
