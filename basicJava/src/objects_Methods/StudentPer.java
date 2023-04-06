package objects_Methods;

public class StudentPer {
	float per=0;
	int id;
String name;
	float m1, m2, m3;

	void setStudentData(int id, String name, float m1, float m2, float m3) {
		this.id = id;
		this.name=name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.display();

	}

	float per() {
		float total = (m1 + m2 + m3);
		float per = total/3;
		return per;
	}

	void grade(float per) {
		if(per>=70) {
			System.out.println("Distingstion");
	}else if(per>=60) {
		System.out.println("First class");
	}
	}
	
   void display() {
	   System.out.println(id+" "+ name+" " +m1+" "+m2+" "+m3);
   }


}


