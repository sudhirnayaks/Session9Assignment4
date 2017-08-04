package session9;

public class Employee {
	private String name;
	private String designation;
	private double salary;
	
	public Employee(String name,String designation,double salary ){
		this.name=name;
		this.designation=designation;
		this.salary=salary;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString(){
		return "Name :"+this.name+"\nDesignation :"+this.designation+"\nSalary :"+this.salary;
		
	}

}
