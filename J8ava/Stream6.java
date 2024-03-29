 package J8ava;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream6 {
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
		
		
		
              employeeList.stream().forEach (i->{if(i.gender=="Female") {
            	  //System.out.println(i.name);
            	  }
              });
              
             // employeeList.stream().filter(i->i.age>30).forEachOrdered(i->System.out.println(i.name));
              
              
              List<Employee>  taxname= employeeList.stream().filter(i->i.salary>10000).collect(Collectors.toList());
              
              for (Employee employee : taxname) {
				//System.out.println(employee.name +" "+employee.salary );
			}
              
              Map<String,Integer> namelist=employeeList.stream().collect(Collectors.toMap(Employee::getName, Employee::getAge));
              //System.out.println(namelist);
	
              
            //  Map<Integer, Double> ageslrar= employeeList.stream().collect(Collectors.toMap(Employee::getAge, Employee::getSalary));
               List<Employee>  name=employeeList.stream().filter(i->i.getName().startsWith("M")).collect(Collectors.toList());   
               
               Optional<Employee> salmax=employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary));
               
               
               
               System.out.println(salmax.get());
               
               for (Employee employee : name) {
				//System.out.println(employee.getName());
			}
               
               
               employeeList.stream().forEach(i->{if(i.gender=="Male") {
            	//System.out.print(i.name);   
               }
            	   
               });
               
               List<Employee>  listemp=employeeList.stream().filter(i->i.getName().startsWith("X")).collect(Collectors.toList());
               
               
               for(Employee employee : listemp) {
            	 //  System.out.print(employee.getAge());
               }
               
               
               List<String> namespecific=employeeList.stream().filter(i->i.getYearOfJoining()>2000).map(Employee::getName).collect(Collectors.toList());
               Employee  max=employeeList.stream().max((i1,i2)->i1.name.compareTo(i2.name)).get();
               
               System.out.println("--------->"+max.salary);
               
           for(int i=0;i<namespecific.size();i++) {
        	  // System.out.println("<-->"+namespecific.get(i));
           }
           
           List<Employee> decorder=employeeList.stream().sorted((i1,i2)->(int)(i2.salary-i1.salary)).collect(Collectors.toList());
           
         //  decorder.forEach(i->System.out.print(i));
           //higest paid employee form each dept
           
           Map<String,List<Employee>> deptwisesalary=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
           System.out.println("deptwisesalary"+ deptwisesalary);
}
}
