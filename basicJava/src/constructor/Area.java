package constructor;

public class Area {
	
void area(int a,int b) {
	System.out.println("Area of rectangle :"+ " "+(a*b));
}
void area(int a) {
	System.out.println("Area of square :"+ " "+(a*a));
}
void area(float a,float b) {
	System.out.println("Area of Trangle :"+ " "+0.5*(a/b));
}
void area(float a) {
	System.out.println("Area of circle :"+ " "+3.14*(a*a));
}
void area(float a,int b ) {
	System.out.println("Area of ellipse :"+ " "+3.14*(a*b));
}
void area(float a,int b,float c) {
	System.out.println("Area of Trapezoid :"+ " "+0.5*(a+b)*c);
}


	public static void main(String[] args) {
		
		Area a1=new Area();
		a1.area(0.4f, 0.7f);
		a1.area(15, 8);
		a1.area(45, 8, 9.2f);
		a1.area(8.2f);
		a1.area(2.3f, 5);
		a1.area(22);
		
}
}