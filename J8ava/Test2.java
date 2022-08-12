package J8ava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {
	
	
 public  class	Employee{
		
		int id;
		String name;
		int age;
		
		
	 Employee(int id,String name,int age){
		 this.id=id;
		 this.name=name;
		 this.age=age;
		 
	 }
		
	}

	
	
	public  void main(String arg[]) {
		
		List<Employee> list=new  ArrayList<>();
		
		list.add(new Employee(3, "niant", 33));
		list.add(new Employee(4, "rahul", 33));
		list.add(new Employee(355, "sham", 33));
		list.add(new Employee(1, "ram", 33));
		
		  Collections.sort(list,  new Comparator<Employee>() {
			  
			  @Override
			  public int compare(Employee o1,Employee o2) {
				  if(o1.age==o2.age)
					  return 0;
				  if(o1.age> o2.age)
					  return 1;
				  
				  else
					  return -1;
			  }
			  
			  
			  
		});
		
		
		
	}
}
