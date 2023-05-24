package inheritance_MethodOveriding;

public class TestVegetable {

	public static void main(String[] args) {
		Carrot ct=new Carrot();
		ct.name="Carrot";
		ct.price=80;
		ct.qty=1;
		ct.wash();
		ct.chop();
		ct.prepareHalwa();
		
		Chilly c=new Chilly();
		c.name="Chilly";
		c.price=25;
		c.qty=1;
		c.wash();
		c.chop();
		c.prepareBajji();
	}

}
