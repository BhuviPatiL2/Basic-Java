package object;

public class TestPen {

	public static void main(String[] args) {
	Pen p1=new Pen();
	p1.color="Blue";
	p1.price=200.55;
	
	Pen p2=new Pen();
	p2.color="Red";
	p2.price=200.05;
	
	
	System.out.println("Pen color "+ p1.color+" "+ "Price :"+p1.price);
	System.out.println("Pen color " +p2.color+" "+" Price :"+p2.price);
	}

}
