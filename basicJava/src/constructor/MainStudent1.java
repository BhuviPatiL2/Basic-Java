package constructor;

public class MainStudent1 {
static String a;
int b;
static {  //used till jdk 1.7
	a="Welcome";
	System.out.println("Block 1: "+a);
	//System.out.println(b);
}
static  {
	System.out.println("Block 2");
	
}

	public static void main(String[] args) {
	
	
		Student1 s1=new Student1();
		Student1 s2=new Student1();
		Student1 s3=new Student1();
		s1.setStudentData(1,"shweta",98);
		s2.setStudentData(2,"shivani",89);
		s3.setStudentData(3,"shivraj",85);
 
}
}
