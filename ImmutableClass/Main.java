package ImmutableClass;

public class Main {
	
	public static void main(String arg[]) {
		Department dept=new Department();
		dept.setDptname("java");
	
	Employee emp=new Employee("nishant", 1, dept );
	
	
	System.out.println(emp);
	
	//try to change
	
	Department  dept2=emp.getDept();//get the name form the immutable class//
	dept2.setDptname("ml");// get the new value form the mutuable class  so how we handle this
	
	System.out.println(emp);

}
	
}
