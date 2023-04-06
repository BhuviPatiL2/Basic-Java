//

package assignmentOnVariable_DataTypes;
import java.util.*;
public class SimpleIntrest {

	public static void main(String[] args) {
		int p,t,r;
	     Scanner sc=new Scanner (System.in);
	     System.out.println("Enter principle amount");
         p= sc.nextInt();
         System.out.println("Enter time period in years");
         t= sc.nextInt();
         System.out.println("Enter rate");
         r= sc.nextInt();
        int s=(p*t*r)/100;
        System.out.println("Simple intrest :"+s);
	}

}
