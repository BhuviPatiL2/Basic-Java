package inheritance;

public class PersonMain {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setName("Bhuvi");
		e1.setContact("88577982242");
		e1.setAddress("Kolhapur");
		e1.setSalary(37000);
		e1.setDept("SDE");
		
		e1.setEid(22);
		e1.display();
		e1.pfcalculate();

	}

}
