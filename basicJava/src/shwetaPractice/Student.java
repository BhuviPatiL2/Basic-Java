package shwetaPractice;

public class Student {
	String name, contact;
	int age, rollno, percentage;
	final String clgname = "NMCOE";
	int noh=3;

	void StudentData() {
	

		System.out.println(this.name + " Styding for " + noh + " houres");
		System.out.println("Roll Number :" + this.rollno + " " + "Percentage :" + this.percentage);
		System.out.println("College Name :" + clgname);
		System.out.println("------------------------------------------");

	}
	
	

}
