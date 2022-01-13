package J8ava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

//Comparable implementation
 class Student implements Comparable<Student>{
	
	
		
		@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}


		int rollno;
		String name;
		int age;
		
		
		Student(int rollno,String name,int age){
			super();
			this.rollno=rollno;
			this.name=name;
			this.age=age;
		
	}

		
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		
		if(rollno==o.rollno)
			return 0;
		
		else if(rollno>o.rollno)
			return 1;
		
		else
			return -1;
		
	
	}


	

}

 public class DemoComparable{
	 
	 
	 public static void main(String arg[]) {
		 
		 List<Student> list=new ArrayList<>();
		 list.add(new Student(12, "ram", 22));
		 list.add(new Student(1, "mohit", 23));
		 list.add(new Student(2, "nishant", 26));
		 list.add(new Student(5, "shobit", 25));
		 
		 Collections.sort(list);
		 
		 //list.forEach(i->System.out.println(i));
		 Student min= list.stream().min((i1,i2)->  i1.age -(i2.age)).get();
		 
		 //.max((x, y) -> Integer.compare(x.getAge(),y.getAge()))
		 Student  max= list.stream().max((i1,i2)  -> i1.age -(i2.age)).get();
		 
		 
		 System.out.println(min);
		 System.out.println(max);
		 
	 }
 }
