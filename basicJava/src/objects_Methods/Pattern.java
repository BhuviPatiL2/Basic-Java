package objects_Methods;
import java.util.*;
public class Pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" 1.numpattern\n 2.alphapattern\n 3.starpattern");
		System.out.println("Select from above");
		int a=sc.nextInt();
		PatternLogic obj=new PatternLogic();
		switch (a) {
		case 1:
			obj.numPiramid();
			break;
		case 2:
			obj.alphaPattern();
			break;
		case 3:
			obj.starPattern();
			break;
		}
		
		PatternLogic p1 =new PatternLogic();
		//p1.numPiramid();
		//p1.alphaPattern();
		//p1.starPattern();

	}

}
