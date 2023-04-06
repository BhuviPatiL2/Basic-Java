//1.	print 2 objects in sysout and see its hashcode is different Eg Student@15db9742 and Student@2329742


package writenTests;

public class Student {

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);


		

	}

}
