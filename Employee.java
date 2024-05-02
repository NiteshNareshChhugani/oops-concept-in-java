package oops;

public class Employee {
	String empname;
	String empdesignation;
	int empsallery;
	public Employee(String empname,String empdesignation,int empsallery)
	{
		this.empname=empname;
		this.empdesignation=empdesignation;
		this.empsallery=empsallery;
	}
	public Employee()
	{
		empname="Nitesh";
		empdesignation="Customer Relation Advisor";
		empsallery=20000;
	}

	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpdesignation() {
		return empdesignation;
	}
	public void setEmpdesignation(String empdesignation) {
		this.empdesignation = empdesignation;
	}
	public int getEmpsallery() {
		return empsallery;
	}
	public void setEmpsallery(int empsallery) {
		this.empsallery = empsallery;
	}
	public void display() {
		System.out.println("Employee Name is: "+ empname);
		System.out.println("Employee Designame is is: "+ empdesignation);
		System.out.println("Employee Sallery is: "+ empsallery);
	}
	public static void main(String[] args) {
		Employee emp=new Employee("NItesh","Customer Relation Advisor",20000);
		emp.display();

	}

}
