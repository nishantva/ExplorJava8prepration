package ImmutableClass;

final class Employee {
	final private String name;
	final private int id;
	
	final private Department  dept;// phly 
	
	Employee(String name,int id,Department dept){
		this.name=name;
		this.id=id;
		this.dept=dept;
	}
	

	public String getName() {
		return name;
	}

	public int getid() {
		return id;
	}

public Department getDept() {
	Department dd=new Department();
	dd.setDptname(dept.getDptname());//  object return kiya hai old value leykr 
	return dd;
}


@Override
public String toString() {
	return "Employee [name=" + name + ", id=" + id + ", dept=" + dept + "]";
}

}
