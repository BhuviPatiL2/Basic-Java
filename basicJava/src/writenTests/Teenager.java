package writenTests;

public class Teenager extends Kid {
	public void readBook() {
		System.out.println("Teenager is reading book");
	}
	public static void main(String[] args) {
		Kid k1=new BigKid();
		Kid k2=new Teenager();
		k1.readBook();
		k2.readBook();
	}
	

}
