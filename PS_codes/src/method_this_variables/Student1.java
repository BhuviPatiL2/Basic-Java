package method_this_variables;

public class Student1 {
	String name;
	double height;
	final String instituteName = "PentagonSpace"; //Globe constant

	public void study() {
		int noh = 2;
		System.out.println(this.name + " study for " + noh + " hours");
		System.out.println(instituteName);    
	}

	public static void main(String[] args) {
		Student1 s = new Student1();
		s.name = "Sundra";
		s.height = 5.6;
		Student1 s1 = new Student1();
		s1.name = "Sundri";
		s1.height = 3.6;
		s.study();
		s1.study();

	}

}
