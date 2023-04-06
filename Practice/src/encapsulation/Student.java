package encapsulation;

public class Student {
	private int rollno, id,per;
	private String name;
	

	public Student(int rollno, int id, int per, String name) {
		this.rollno = rollno;
		this.id = id;
		this.per = per;
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

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
	
	public void per () {
		if(per>=35) {
		System.out.println("Placed");
	}else {
			System.out.println("Not Placed");
			
		}
		
		//return per;
	}

	public static void main(String[] args) {
		Student s1=new Student(22,2,40,"Shivani");
		System.out.println(s1.getRollno()+" "+s1.getId()+" "+s1.getPer()+" "+s1.getName());
		s1.per();
		//System.out.println(s1.per);
	}

}
