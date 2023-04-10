package basicProgramming;

public class Example {
	
	
	
	public static void main(String[] args) {
		Example e=new Example();
		e.main(args);
		e.main(4.5f, 3.2f);
		e.main(3, 4);
		
		
	}
	public static void main(int a,int b) {
		System.out.println(a+b);
	}
	public static void main(float a,int b) {
		System.out.println(a+b);
	}
	public static void main(float a,float b) {
		System.out.println(a+b);
	}

}
