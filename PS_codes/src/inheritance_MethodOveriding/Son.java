package inheritance_MethodOveriding;

public class Son extends Father {
	
	public void drink() {
		System.out.println("drink juice");
	}
	public static void main(String[] args) {
		Son s=new Son();
		//s.smoke();
		s.sleep();
		s.money=2000;
		s.eat();
		s.drink();  //Overridden method
	}

}
