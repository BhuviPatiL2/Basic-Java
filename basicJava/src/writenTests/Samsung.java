package writenTests;

public class Samsung extends Mobile {
	public void displayname() {
		System.out.println("Samsung");
		
	}
	public static void main(String[] args) {
		Samsung s=new Samsung();
		s.cQuality="Camera: 45MP";
		s.displayname();
	     s.displayApplication();
		s.display();

	}

}
