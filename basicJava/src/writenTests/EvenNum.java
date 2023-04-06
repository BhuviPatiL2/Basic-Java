//4.	WAP to print even numbers from 121 to 229 using while loop. 
package writenTests;

public class EvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=121;
		while(a<=229) {
			a++;
			if (a%2==0) {
				System.out.print(a+" ");
			}
		}

	}

}
