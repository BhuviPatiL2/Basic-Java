package constructor;

public class Employee2 {

	private int id, salary;
	private String name, dept, contact;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	//public void setSalary(int Salary) {
	//	this.salary = salary;
	//}

	public int getSalary() {
		return salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}
	public void setContact(String contact) {
		this.contact=contact;
	}

	//public void setContact(String Contact) {
	//	this.contact = contact;
	//}

	public String getContact() {
		return contact;
	}

	public static void main(String[] args) {
		System.out.println();
	}
}