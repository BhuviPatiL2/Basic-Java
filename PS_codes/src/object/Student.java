package object;
//creation of object 
public class Student {
	String name;
	public static void main(String[] args) {
		Student s1=new Student ();           // object 
		s1.name="Bhuvi";
		System.out.println(s1);             //gives hexadecimal address of that object
		System.out.println(s1.name);

	}

}
