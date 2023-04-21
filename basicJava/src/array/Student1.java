package array;

import java.util.*;

public class Student1 {
	int id, per;
	String name, dept;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPer() {
		return per;
	}

	public void setPer(int per) {
		this.per = per;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String toString() {
		return id + " " + name + " " + dept + " " + per;
	}

	public static void main(String[] args) {
		Student1 obj = new Student1();
		Student1 arr[] = new Student1[1];
		Scanner sc = new Scanner(System.in);
		Student1 s = new Student1();
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter id,name,department and percentage of student");
			int id = sc.nextInt();
			String name = sc.next();
			String dept = sc.next();
			int per = sc.nextInt();

			//Student1 obj = new Student1();
			obj.setId(id);
			obj.setName(name);
			obj.setDept(dept);
			obj.setPer(per);

			arr[i] = obj;
		
				
			
			
		}
		//System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
		//	System.out.println(obj.getId()+" "+obj.getName()+" "+obj.getDept()+" "+obj.getPer());
			System.out.println(arr[i]);
			System.out.println(arr.length);
			
		}
	}
}
		
		
		
		

			
					