package session9;

import java.util.TreeSet;

public class Assignment4 {

	public static void main(String[] args) {
		
		TreeSet<Employee> employee=new TreeSet<>(new CompareSalary());
		
		employee.add(new Employee("Sudhir","QA Lead", 50000));
		employee.add(new Employee("Nayak","QA Lead",50000));
		employee.add(new Employee("Sujir","DBA", 40000));
		employee.add(new Employee("Bahubali","DBA", 60000));
		employee.add(new Employee("Santu","QA", 25000));
		

		for(Employee emp:employee){
			
			System.out.println(emp);
		}
		
	}

}
