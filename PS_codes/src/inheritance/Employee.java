package inheritance;

public class Employee extends Human {
	int empId=2;
	int salary = 35000;
    String dept="HR";
	
	
	void Data() {
		System.out.println("The name of Student "+this.name);
		System.out.println("Her Personal Details :" );
		System.out.println(" Contact Number :" +this.contact+"\n "+"Adhar Number :"+ this.adharNo);
		System.out.println("------------------------------------");
		
		System.out.println(this.name + " has empID" + empId);
		System.out.println("Department name : "+this.dept);
		System.out.println(this.name + " gets salary " + salary);

	}
	
}
