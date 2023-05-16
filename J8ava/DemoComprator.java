
//DemoComprator


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students {
	
	
		
	


		int rollno;
		String name;
		int age;
		
		
		Students(int rollno,String name,int age){
			//super();
			this.rollno=rollno;
			this.name=name;
			this.age=age;
		
	}
		
		public String getName() {
			return name;
		}

		
		public int getAge() {
			return age;
		}

	@Override
	public String toString() {
		return "Students [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}
		
		
		
		

	 


	

}

 public class DemoComprator{
	 
	 
	 public static void main(String arg[]) {
		 
		 List<Students> list=new ArrayList<>();
		 list.add(new Students(12, "ram", 22));
		 list.add(new Students(1, "mohit", 23));
		 list.add(new Students(2, "nishant", 26));
		 list.add(new Students(5, "shobit", 25));
		 
		 
		 
		// Collections.sort(list, new Comparator<Students>() {

			//	@Override
			//	public int compare(Students o1, Students o2) {
				//	if(o1.age==o2.age)
					//	return 0;
					
				//	else if(o1.age>o2.age)
					//	return 1;
					
					//else
						//return -1;
			//	}
		//	});
		 
		 Collections.sort(list,Comparator.comparingInt(Students:: getAge));
			 
		 for( Students s: list) {
			 System.out.println(s);
		 }
		 
	 }
 }
