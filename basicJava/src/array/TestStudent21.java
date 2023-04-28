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
		
		/*stud[0]=new Student(12,"Raj","Computer",70);
		stud[1]=new Student(120,"Riya","Computer",56);
		stud[2]=new Student(1,"Arjun","Civil",70);
		stud[3]=new Student(45,"Karan","ENTC",60);
		stud[4]=new Student(23,"Rahul","Computer",60);
		stud[5]=new Student(5,"Anjali","Computer",65.5f);
		stud[6]=new Student(87,"Bhuvi","Electrical",51);
		stud[7]=new Student(100,"Ramesh","Mechanical",55);
		stud[8]=new Student(50,"Suresh","Mechanical",60);
		stud[9]=new Student(145,"Nilima","Civil",70);
		stud[10]=new Student(167,"Ram","Mechanical",55);
		stud[11]=new Student(52,"Nilam","Mechanical",60);
		stud[12]=new Student(15,"Shweta","Civil",70);
		stud[13]=new Student(52,"Sunny","Mechanical",60);
		*/
		
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
