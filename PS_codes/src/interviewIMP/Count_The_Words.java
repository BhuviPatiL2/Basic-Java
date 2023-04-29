package interviewIMP;
import java.util.*;
public class Count_The_Words {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		String str=sc.nextLine();
		int countSpace=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch==' ') {
				countSpace++;
			}
		}
		int word=countSpace+1;
		System.out.println(word);
	}

}
