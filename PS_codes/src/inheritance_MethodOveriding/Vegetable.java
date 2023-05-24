package inheritance_MethodOveriding;

public class Vegetable{
	int price;
	double qty;
	String name;
	void wash() {
		System.out.println(this.name+" is washed");
	}
	void chop() {
		System.out.println(this.name+" is chopped");
	}

}
