package interviewIMP;
import java.util.*;
public class ReversingString {

	public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   String str=sc.nextLine();
   String str2="";
   for(int i=str.length()-1;i>0;i--) {
	   char ch=str.charAt(i);
	   str2=str2+ch;
   }
   System.out.println(str2);

	
	
	
	
	
	

}
}
