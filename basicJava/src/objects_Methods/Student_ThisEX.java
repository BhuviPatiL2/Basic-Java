package objects_Methods;

public class Student_ThisEX {

	int id;
	String name,dept;
	float marks;
	void setStudentData(int id,String name,String dept,float marks) {
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.marks=marks;
		this.display();

	}
   void display() {
	   System.out.println(id+" "+name+" "+dept+" "+marks+" ");
   }
}
