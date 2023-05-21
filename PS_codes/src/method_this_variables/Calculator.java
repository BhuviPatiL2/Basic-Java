package method_this_variables;

public class Calculator {
	String name;
	public void sum() {
		System.out.println(this.name);
		int a=3;                               //local variable
		int b=5;
		int sum=a+b;
		System.out.println("Sum "+sum);
	}
	public static void main(String[] args) {
		Calculator c=new Calculator();
		c.name="Casio";
		c.sum();
		
		
	}

}
