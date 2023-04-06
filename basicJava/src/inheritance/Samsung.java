package inheritance;

public class Samsung extends Mobile{

	public static void main(String[] args) {
		Samsung s1=new Samsung();
		s1.makeACall();
		s1.sendAMsg();
		s1.takeAPicture();
		s1.setPrice(32000);
	System.out.println(s1.getPrice());
	
	}

}
