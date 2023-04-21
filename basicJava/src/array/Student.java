package array;
//using constructor 
public class Student {
	
	int id;
	String name,dept;
	float marks;
	Student(int id,String name,String dept,float marks){
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.marks=marks;
	}
	public String toString() {
		return id+" "+name+" "+dept+" "+marks;
	}

}
