package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Student {
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name);
	}


	String name;
	int id;
	Student(String name,int id){
		this.id=id;
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


	public String toString() {
		return name +","+id;
	}
	
	public static void main(String arg[]) {
		List<Student>  list=new ArrayList<Student>();
		
		list.add(new Student("rahul",1));
		list.add(new Student("aman",3));
		list.add(new Student("shubh",5));
		list.add(new Student("nish",2));
		list.add(new Student("baba",6));
		
		Collections.sort(list,Comparator.comparing(Student::getName));
		Student  maxid=list.stream().max(Comparator.comparing(Student::getName)).get();
		
		System.out.print(maxid);
	}
}
