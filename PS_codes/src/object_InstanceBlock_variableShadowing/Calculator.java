package object_InstanceBlock_variableShadowing;

public class Calculator {
	
	public int add(int a,int b) {
		int sum=a+b;
		return sum;
	}
	public void close() {
		System.out.println("Resource closed");
	}
public static void main(String[] args) {
	Calculator c=new Calculator();
	int sum=c.add(10, 12);
	System.out.println("Sum :" +sum);
	c.close();
}
}
