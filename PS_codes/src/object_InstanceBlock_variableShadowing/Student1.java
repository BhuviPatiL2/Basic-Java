package object_InstanceBlock_variableShadowing;

public class Student1 {
String name;
{
	//Instance block
	name="Guldu";
	System.out.println("Name of the student "+this.name);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1=new Student1();
		Student1 s2=new Student1();
		Student1 s3=new Student1();
		Student1 s4=new Student1();
		Student1 s5=new Student1();
		Student1 s6=new Student1();
		Student1 s7=new Student1();
		
	}

}
