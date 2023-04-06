package shwetaPractice;

public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Sundra";
		s1.rollno = 40;
		s1.percentage = 70;
		
		Student s2 = new Student();
		s2.name = "Sundri";
		s2.rollno = 41;
		s2.percentage = 75;
		
		s1.StudentData();
		s2.StudentData();

	}

}
