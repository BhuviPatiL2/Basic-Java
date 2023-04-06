/*Create a class Student with 4 variables called as rollNo, admissionNo, age, 
courseId. Each of the variables should have one of the access modifier: public, 
protected, no-access-modifier and private. Add 4 methods in the class: public 
method doPublic, no access modifier method doDefault, protected method 
doProtected, private method doPrivate*/

package basicProgramming;

public class Student {
	public int rollno = 23;
	int courseId = 145;
	private int admissionNo = 144;
	protected int age = 22;

	public void rollno() {
		System.out.println(rollno);

	}

	void courseId() {

		System.out.println(courseId);

	}

	private void admissionNo() {

		System.out.println(admissionNo);

	}

	protected void age() {

		System.out.println(age);

	}

}