package shwetaPractice;

public class Test2 {
	void method(String i) {
		System.out.println("I am string ");
	}
	void method(Product i) {
		System.out.println("I am Product ");
	}
	void method(Division d) {
	System.out.println("I am division ");	
	}
	public static void main(String[] args) {
		Product p=new Product();
		Test2 t=new Test2();
		Division d=new Division();
		t.method("Hello");
		t.method(p);
		t.method(d);
		//t.method(null);   error
	}

}
