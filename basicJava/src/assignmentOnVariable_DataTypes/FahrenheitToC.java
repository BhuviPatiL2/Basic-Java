package assignmentOnVariable_DataTypes;
import java.util.*;
public class FahrenheitToC {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a value to convert Fahrenheit to celsius");
	   float f=sc.nextFloat();
	   float c=(f-32)*5/9;
	   System.out.println(c+"C");
	  // (32°F − 32) × 5/9 = 0°C

	}

}
