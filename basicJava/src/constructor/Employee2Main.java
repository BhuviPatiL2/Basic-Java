package constructor;

public class Employee2Main {

	public static void main(String[] args) {
		Employee2 e1=new Employee2 ();
		e1.setId(2);
		e1.setName("shweta");
		e1.setContact("9999900000");
		e1.setDept("HR");
		e1.setSalary(40000);
		System.out.println(e1.getId()+ " "+e1.getName()+" "+e1.getContact()+" "+e1.getDept()+" "+e1.getContact());
		e1.setContact("8857982242");
		System.out.println(e1.getId()+ " "+e1.getName()+" "+e1.getContact()+" "+e1.getDept()+" "+e1.getContact());
		
		e1.setId(1);
		e1.setName("vishal");
		e1.setContact("9999900020");
		e1.setDept("SDE");
		e1.setSalary(400000);
		
		System.out.println(e1.getId()+ " "+e1.getName()+" "+e1.getContact()+" "+e1.getDept()+" "+e1.getContact());
		
	}

}
