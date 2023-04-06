package assignmentOnVariable_DataTypes;
import java.nio.file.spi.FileSystemProvider;
import java.util.*;
public class CelsiusToF {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value to conver celsius to Fahrenheit");
		float c=sc.nextFloat();
		float f=(c*9/5)+32f;
		System.out.println(f+" Fahrenheit");
		}
}
