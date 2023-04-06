package inheritance;

public class Student extends Person {
	int rollno,per;
	int grade;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getPer() {
		return per;
	}
	public void setPer(int per) {
		this.per = per;
	}
/*	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	*/
	public void grade() {
		if(per>65) {
			System.out.println("You got 1St class...Keep it up");
		}else if(per>70 && per<80) {
			System.out.println("Congrtulations!!! You got distinction ...");
		}else if(per<35) {
			System.out.println("Sorry :( You are fail");
		}
	}
	void display() {
		System.out.println(name+" "+contact+" "+address+" "+rollno+" "+per+" "+grade);
	}

}
