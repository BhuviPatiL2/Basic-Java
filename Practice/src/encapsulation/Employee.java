package encapsulation;

public class Employee {
	int id,salary,hike;
	float pf;
	String name,deptname;
	Employee(){
		this.id=id;
		this.salary=salary;
		this.name=name;
		this.deptname=deptname;
		this.pf=pf;	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	
	float pfcalculator() {
		pf=salary*0.12f;
		return pf;
	}
	
	void hike() {
		
		System.out.println("You will get it in a upcoming months");
	}
	
	
	void display() {
		System.out.print(name+" "+deptname+" "+id+" "+salary+" "+pfcalculator());
		System.out.println("----------------------------------------");
		
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setId(101);
		e.setName("Vicky");
		e.setSalary(41000);
		e.setDeptname("SDE");
		e.display();
		
		e.hike();
	
		Documentation d=new Documentation();
		d.contact("8857982242", 400404);
		d.contact("8857982242", "bhuvi@gmail.com");
		d.contact("889997766" ,"ghost@gmail.com", 415402);
		d.hike();
	}

}
