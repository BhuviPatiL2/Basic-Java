package constructor_constructorOverloading;

public class Mobile {
	String color;
	Mobile(){
		color="Black";
	}
public static void main(String[] args) {
	Mobile m=new Mobile();
	System.out.println(m.color);
	Mobile m1=new Mobile();
	System.out.println(m1.color);
}
}
