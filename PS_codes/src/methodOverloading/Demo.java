package methodOverloading;

public class Demo {
void meth(int i) {
	System.out.println("I am int ");
}
void meth(long l) {
	System.out.println("I am long ");
}
void meth(String s) {
	System.out.println("I am String ");
}
void meth(Product s) {
	System.out.println("I am Product ");
}

	public static void main(String[] args) {
		Demo d=new Demo();
		d.meth(0);
		
		Product p=new Product();
		//d.meth(null);// error because null matches  with both string and product 
		d.meth("Hello");
		d.meth(p);
       
	}

}
class Product{
	
}