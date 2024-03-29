package J8ava;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{
	
	int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	String name;

	public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	int age;

	String gender;

	String department;

	int yearOfJoining;

	double salary;
	
	
}















public class Stream3 {

	
	public static void main(String arg[]) {
		 List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		
		
		//print femal employee
		
		//Map<String, Long> femalemp=employeeList.stream()
		
		Map<String, Long> femalemp=employeeList.stream().collect(Collectors.groupingBy(Employee:: getGender,Collectors.counting()));
		System.out.println(femalemp);
		
		System.out.println("-----------------------------------------------");
		
		employeeList.stream().map(Employee::getDepartment).distinct().forEach(i->System.out.println(i));
		
		System.out.println("-----------------------------------------------");
		
		Map<String, Double> avg=employeeList.stream().collect(Collectors.groupingBy(Employee:: getGender,Collectors.averagingDouble(Employee::getAge)));
		
		Map<String, Double>  avgjd=employeeList.stream().collect(Collectors.groupingBy(Employee::getName,Collectors.averagingDouble(Employee::getSalary)));
		
		System.out.println(avg);
		
		System.out.println("-----------------------------------------------");
		
		
		Optional<Employee> higestpayemployee=employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary));
		
		Optional<Employee>  hidh=employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary));
		
		System.out.println(higestpayemployee.get().getName());
	
		System.out.println("-----------------------------------------------");
		
		Map<String,Long> departmentcount=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		
		System.out.println(departmentcount);
		
		
		System.out.println("-----------------------------------------------");
		
		employeeList.stream().filter(i->i.getYearOfJoining()>2015).map(Employee::getName).forEach(i->System.out.println(i));
		
		
		System.out.println("-----------------------------------------------");
		
		Optional<Employee> higestworkexp= employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
		
		System.out.println(higestworkexp.get().getName());
		System.out.println("-----------------------------------------------");
		Optional<Employee> oldestEmployeeWrapper = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
		
		System.out.println(oldestEmployeeWrapper.get().getAge());
		
		System.out.println("-----------------------------------------------");
		
		Map<String, Double> namewithsalaryexp=employeeList.stream().collect(Collectors.groupingBy(Employee::getName,Collectors.averagingDouble(Employee::getSalary)));
		
		System.out.println(namewithsalaryexp);
		
		System.out.println("-----------------------------------------------");
		
		Map<String,Double> namewithsalary1=employeeList.stream().collect(Collectors.toMap(Employee::getName, Employee::getSalary));
		System.out.println(namewithsalary1);
		
		List<String>  namelist=employeeList.stream().map(Employee::getName).collect(Collectors.toList());
		//System.out.println(null);
		
		 Optional<Employee> max=employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary));
		 
		 
	}

}
