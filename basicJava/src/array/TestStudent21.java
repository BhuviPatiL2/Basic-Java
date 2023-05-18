package array;
import java.util.*;
public class TestStudent21 {
	
	Student stud[]=new Student[3];   //array
	Scanner sc=new Scanner(System.in);
	
	void studentData() {
		for(int i=0;i<stud.length;i++)
		{
			System.out.println("Enter id,name,dept,marks of "+(i+1)+" student: ");
			int id= sc.nextInt();
			String name= sc.next();
			String dept=sc.next();
			float marks=sc.nextFloat();
			
			Student s= new Student(id,name,dept,marks);    //array object
			
			stud[i]=s;
		}
		
		
	}
	void displayArray()
	{
		
		System.out.println(Arrays.toString(stud));
	}
	void addStudentData() {
		for(int i=0;i<stud.length;i++)
		if(stud[i]==null) {
			System.out.println("Enter id,name,dept,marks of "+(i+1)+" student: ");
			int id=sc.nextInt();
			String name= sc.next();
			String dept=sc.next();
			float marks=sc.nextFloat();
			Student s=new Student(id,name,dept,marks);
			stud[i]=s;
			
			break;
			
		}
	}

	public static void main(String[] args) {
		TestStudent21 obj=new TestStudent21();
		obj.studentData();
		obj.addStudentData();
		obj.displayArray();
	}

}
