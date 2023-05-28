package object_InstanceBlock_variableShadowing;

//multiple references to the same object

public class Pen1 {

	public static void main(String[] args) {
		 Pen1 p1 =new  Pen1();
		Pen1 p2=p1;
		System.out.println(p1);
		System.out.println(p2);

	}

}
