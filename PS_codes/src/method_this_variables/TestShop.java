package method_this_variables;

public class TestShop {

	public static void main(String[] args) {
		Shop s=new Shop();
		s.address="BTM layout";
		s.contact="8857982242";
		Shop s1=new Shop();
		System.out.println(s.address+"  "+s.contact);
		System.out.println(s1.address+"  "+s1.contact);
		
	}

}
