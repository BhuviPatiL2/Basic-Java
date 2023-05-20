package method;

public class Student {
	String name="shweta";
	int age=19;
	
	public void study() {
		System.out.println(name+" is studying");
		sleep();
	}
	public void sleep() {
		System.out.println(name+" fall for sleep while studying");
	}

}
class TestStudent{
	public static void main(String[] args) {
		Student s=new Student()	;
		s.study();
	}
	
}
