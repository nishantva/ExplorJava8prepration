package J8ava;
//DemoComprator


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Comparable implementation
class Students {
	
	
		
		@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}


		int rollno;
		String name;
		int age;
		
		
		Students(int rollno,String name,int age){
			super();
			this.rollno=rollno;
			this.name=name;
			this.age=age;
		
	}

		

	 


	

}

 public class DemoComprator{
	 
	 
	 public static void main(String arg[]) {
		 
		 List<Student> list=new ArrayList<>();
		 list.add(new Student(12, "ram", 22));
		 list.add(new Student(1, "mohit", 23));
		 list.add(new Student(2, "nishant", 26));
		 list.add(new Student(5, "shobit", 25));
		 
		 Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if(o1.age==o2.age)
					return 0;
				
				else if(o1.age>o2.age)
					return 1;
				
				else
					return -1;
			}
		});
		 
		 for( Student s: list) {
			 System.out.println(s);
		 }
		 
	 }
 }
