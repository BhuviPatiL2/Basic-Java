package array;
import java.util.*;
public class StudentMain {
	Student s[]=new Student[3];
	Scanner sc=new Scanner (System.in);
	void addStudentdata() {
		for(int i=0;i<3;i++) {
		System.out.println("Enter id,name,dept,marks of "+(i+1)+" studnet");	
		int id=sc.nextInt();
		String name=sc.next();
		String dept=sc.next();
		float marks=sc.nextFloat();
		
		Student s1=new Student(id,name,dept,marks);
		s[i]=s1;
		//s[i]=new Student(id,name,dept,marks);
		}
	}
	
	
	
	
	void displayArray() {
		for(Student st:s) {
			System.out.println(st);
		}
	}
	
	
	
	
	
	void deleteStudentData() {
		System.out.println("enter the student id");
		int id=sc.nextInt();
		for(int i=0;i<s.length;i++) {
			if(s[i]!=null) {
				if(s[i].id==id) {
					s[i]=null;
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		StudentMain obj=new StudentMain ();
		obj.addStudentdata();
		obj.displayArray();
		obj.deleteStudentData();

	}

}
