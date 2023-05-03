package array;
import java.util.*;
public class Student2 {
	Student s[]=new Student[3];
	int id;
	String name;
	long marks;
	
	Student2(int id,String name,long marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
		
	}
	
	public void addData() {
		Scanner sc=new Scanner (System.in);
		for(int i=0;i<s.length;i++) {
		System.out.println("Enter id,name and marks of the student");
		   int id=sc.nextInt();
		   String name=sc.next();
		   long marks=sc.nextLong();
		   
		   
			
			Student s1= new Student2(id,name,marks);  
			
			
		   Student s[i]=s1;
			
			
			
			sc.close();
		}
	}

	public static void main(String[] args) {
		
	}
	class Student{
		int id;
		String name;
		long marks;
		
		Student(int id,String name,long marks){
			this.id=id;
			this.name=name;
			this.marks=marks;
			
		}

}
}