import java.util.Objects;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;


public class Employee {	
		int id;
		String Name;
		String dept;
		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}

		int Salary;
		 @Enumerated(EnumType.STRING)
		 private Gender gender;
		
		public Gender getGender() {
			return gender;
		}
		@Override
		public int hashCode() {
			return Objects.hash(Name, Salary, dept, gender, id);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			return Objects.equals(Name, other.Name) && Salary == other.Salary && Objects.equals(dept, other.dept)
					&& gender == other.gender && id == other.id;
		}
		public void setGender(Gender gender) {
			this.gender = gender;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id=id;
		}
	
		
		public String getName() {
			return Name;
		}
		public void setName() {
			this.Name=Name;
		}
		public int getSalary() {
			return Salary;
		}
		
		public void setSalary() {
			this.Salary=Salary;
		}
		
		Employee(int id,String Name,int Salary ,String dept){
			this.id=id;
			this.Name=Name;
			this.Salary=Salary;
			this.dept=dept;
	
		}
	

}



