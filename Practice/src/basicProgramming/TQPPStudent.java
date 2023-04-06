package basicProgramming;

public class TQPPStudent extends Student {
	void checkStudentVariableAccess() {
		System.out.println("Calling a inherited variable");
		
		rollno = 23;
		System.out.println("rollno :" + rollno);
		
		courseId = 2345;
	    System.out.println("courseId :" + courseId);
	    
		// admissionNo = 145
		// System.out.println("admissionNo :" + admissionNo);
		age = 27;
		System.out.println("age:" + age);
		
		System.out.println("---------------------");
	}

	void checkStudentMethodAccess() {
		System.out.println("Calling a inherited method");
		
		Student s1 = new Student();
		
		s1.age();
		s1.courseId();
		s1.rollno();
		// s1.admissionNo();

	}
}
