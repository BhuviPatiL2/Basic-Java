import java.util.*;

class Example {
	public static void main(String[] args) {
		// 8 9= 8+81=89
		// 1 2
		/*int digit = 0, cnt = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		while (0 < n) {

			digit = n % 10;
			n = n / 10;
			cnt++;
			System.out.print(digit + " ");
		}
		System.out.println(cnt + " ");
		int p=1;
		 for(int i=1;i<cnt;i++) {
			 p=p*10;	 
			 
		}
		 System.out.print(p+ " ");
		 
		 */
		 
		         int r, n, num,digits=0,
		         sum = 0;
		         Scanner sc = new Scanner(System.in);
		         System.out.print("Enter number=");
		         n = sc.nextInt();
		         num = n;
		         while (num > 0)
		         {
		             digits++;
		             num = num / 10;
		         }
		         num = n;
		         while (num > 0)
		         {
		             r = num % 10;
		             sum = sum + (int)Math.pow(r, digits);
		             num = num / 10;
		             digits--;
		         }        
		         
		         if(n==sum)
		         {
		             System.out.println("Disarium Number");
		         }
		         else
		         {
		             System.out.println("Not Disarium Number");
		         }
		         
		     }
		 
	}

