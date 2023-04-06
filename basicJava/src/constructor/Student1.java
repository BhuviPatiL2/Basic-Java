package constructor;

public class Student1 {
	static String clgname="ABC";
	int id,marks;
	String name;

void setStudentData(int id,String name,int marks) {
	this.id=id;
	this.name=name;
	this.marks=marks;
	this.display();
	this.displayclg();

}
void display() {
   System.out.print(id+" "+name+" "+" "+marks+" ");
}
void displayclg() {
	   System.out.println(Student1.clgname);
	  
	}
}