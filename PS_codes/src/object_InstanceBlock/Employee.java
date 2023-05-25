package object_InstanceBlock;

public class Employee {
	{
		System.out.println("IIB 1");
	}
	{
		System.out.println("IIB 2");
	}

	public static void main(String[] args) {
		Employee e = new Employee();

	}

	{
		System.out.println("IIB 3");
	}

}
