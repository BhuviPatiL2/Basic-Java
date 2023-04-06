package ifElse_Programming;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
	
			Scanner scan =new Scanner(System.in);
			System.out.println("enter alphabet");
			char c=scan.next().charAt(0);
			if(c=='a'|| c=='A') {
				System.out.println(c+" is a vowel");
			}else if(c=='e'|| c=='E') {
				System.out.println(c+" is a vowel");
			}else if(c=='i'|| c=='I') {
				System.out.println(c+" is a vowel");
			}else if(c=='o'|| c=='O') {
				System.out.println(c+" is a vowel");
			}else if(c=='u'|| c=='U') {
				System.out.println(c+" is a vowel");
		    }else {
		    	System.out.println(c+" is a consonant ");
		    }
		  
			

	}

}
