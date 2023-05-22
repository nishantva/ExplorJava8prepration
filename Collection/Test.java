package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
		public static void main(String arg[]) {
			
			List<Student>  list=new ArrayList<Student>();
			
			list.add(new Student("nishant",3));
			list.add(new Student("rahul",4));
			list.add(new Student("sham",1));
			list.add(new Student("rohit",2));
			
			
//			Collections.sort(list,new Comparator<Student>() {
//				
//				
//				public int compare(Student s1,Student s2) {
//					if(s1.id>s2.id) {
//						return 1;
//					}
//					if(s1.id<s2.id) {
//						return -1;
//					}
//					if(s1.id==s2.id) {
//						return 0;
//					}
//					return 0;
//					
//				}
//			});
			
			
			Collections.sort(list,Comparator.comparingInt(Student:: getId));// smart version
			
			for (Student student : list) {
				System.out.println(student);
			}
		}

		
	

}
