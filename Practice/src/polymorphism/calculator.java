package polymorphism;
//compile time =========overlading               overriding ========run time  
public class calculator {
	int a,b,c;
	void add(int a,int b) {
		System.out.println("sum "+a+b);
		
	}
	void add(int a,float b) {
		System.out.println("sub "+(b-a));
		
	}
	void add(float a,int b) {
		System.out.println("mul "+a*b);
		
	}
	void add(float a ,float b) {
		System.out.println("div "+a/b);
		
	}

	public static void main(String[] args) {
		calculator c1=new calculator();
		c1.add(20,30);
		c1.add(45, 5.5f);
		c1.add(30.5f, 5);
		c1.add(40.2f, 10.2f);

	}

}







               















