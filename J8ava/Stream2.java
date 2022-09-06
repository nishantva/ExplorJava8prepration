package J8ava;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Studentss {
	
	
	
	@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
}


	int rollno;
	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	String name;
	int age;
	
	
	Studentss(int rollno,String name,int age){
		super();
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	
}


	public Object compareTo(Studentss i2) {
		// TODO Auto-generated method stub
		return null;
	}

	

 




}
public class Stream2 {
	
	
	
	public static void main(String arg[]) {
		
		 List<Studentss> list=new ArrayList<>();
		 list.add(new Studentss(12, "ram", 22));
		 list.add(new Studentss(1, "mohit", 23));
		 list.add(new Studentss(2, "nishant", 26));
		 list.add(new Studentss(5, "shobit", 25));
		//sort byage
		List<Studentss>  sortedByname= list.stream().sorted((e1,e2)->e1.name.compareTo(e2.name)).collect(Collectors.toList());
		
	//	sortedByname.forEach(i->System.out.println(i));
		
		System.out.print("---------------------------------------");
		//sortbyname
		
		List<Studentss>  sortedage=list.stream().sorted(Comparator.comparingInt(Studentss::getAge)) .collect(Collectors.toList());
		
		
		//sortedage.forEach(i->System.out.println(i));
		
		
		
		List<Studentss> namesort=list.stream().sorted(Comparator.comparing(Studentss::getName)).collect(Collectors.toList());
		
		
		namesort.forEach(i->System.out.println(i));
		
		
		List<Studentss>  inc=list.stream().map(e->{
			
			if(e.getAge()>25) {
				e.setRollno(e.getRollno()*2);
			}
			return e;
		}).collect(Collectors.toList());
		
		
		System.out.print(inc);
		
	}

}
