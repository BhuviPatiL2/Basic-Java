package method_this_variables;

public class Employee {
String name,company;
int id;
public void work() {
	int noh=8;
	System.out.println("Employees work for "+ noh+" hours");
	System.out.println("noh is local varible");
	System.out.println("name,id ,company is instance variable");
}
	public static void main(String[] args) {
		Employee e=new Employee();
		e.name="Bhuvi";
		e.company="IBM";
		e.id=22;
		e.work();
	}

}
