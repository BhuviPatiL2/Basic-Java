package method_this_variables;

public class Pen {
	String color;
	public void write() {
		System.out.println(this.color);
	}
	public static void main(String[] args) {
		Pen p1=new Pen();
		p1.color="Yellow";
		Pen p2=new Pen();
		p2.color="Red";
		Pen p3=new Pen();
		p3.color="Green";
		p1.write();
		p2.write();
		p3.write();
	}

}
