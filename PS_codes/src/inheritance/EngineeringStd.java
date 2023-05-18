package inheritance;



public class EngineeringStd extends Employee {
		
	
	
	int marks=82;
	public void study() {
		System.out.println(this.name+" is studying");
		
	}
	void getMarks() {
		System.out.println(this.name+ " "+ "gets "+ this.marks+" "+" marks");
	}
	void empData() {
		
		System.out.println(this.name + " has empID" + empId);
		System.out.println(this.name + " gets salary" + salary);

	}
	public static void main(String[] args) {
		EngineeringStd e=new EngineeringStd ();
		e.study();
		e.Data();
	}
	
}
	
