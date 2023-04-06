//3.	WAP to print odd numbers from 521 to 229 using while loop. 
package writenTests;

public class OddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=521;
		while(a>=229) {
			a++;
			if(a%2!=0) {
				System.out.print(a+" ");
			}
		}
	}

}
