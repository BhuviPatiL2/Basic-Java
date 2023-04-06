//3.	Create class Box and calculate the volume of box 
//volume=length x width x height

package writenTests;

import java.util.Scanner;

public class Box {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float l, w, h;
		System.out.println(" Enter length of box : ");
		l = sc.nextFloat();
		System.out.println(" Enter width of box : ");
		w = sc.nextFloat();
		System.out.println(" Enter height of box : ");
		h = sc.nextFloat();
		float v = l * w * h;
		System.out.println("Volume of Box :" + v);

	}

}
