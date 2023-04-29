package interviewIMP;
import java.util.*;
public class RemoveSpace_String {

	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	String str=sc.nextLine();
	String str2="";
	for(int i=0;i<str.length();i++){
		char ch=str.charAt(i);
		if(ch!=' ') {
			str2=str2+ch;
		}else {
			str2=str2;
		}
		
			//System.out.println(str2);
		}
	System.out.println(str2);
	}
}


