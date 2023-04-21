package writenTests;

public class Mastani implements IceCream,Juice {
	
	public void drink() {
		System.out.println("I am drinking a mango juice");
	}
public	void eat() {
		System.out.println("I am eating a mangoIce-cream");
		
	}

public static void main(String[] args) {
	Mastani m=new Mastani();
	m.drink();
	m.eat();
}
	}


