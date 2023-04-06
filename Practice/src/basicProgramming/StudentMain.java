package basicProgramming;

public class StudentMain {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.age();
		int a = s1.age;
		// int b=s1.admissionNo;

		System.out.println(a);
		System.out.println("========================================");
		TQPPStudent tq = new TQPPStudent();
		tq.checkStudentVariableAccess();
		tq.checkStudentMethodAccess();
	}
}
