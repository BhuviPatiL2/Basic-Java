
/*       9
        898
       78987
      6789876
     567898765
    45678987654
   3456789876543
  234567898765432
 12345678987654321
*/
package assignmentOnPatterns;

public class Pattern10 {

	public static void main(String[] args) {
		
		for (int i = 9; i >= 1; i--) {

			for (int j = 1; j <= i * 2; j++) {
				System.out.print(" ");
			}

			for (int j = i; j <= 9; j++) {
				System.out.print(j + " ");
			}

			for (int j = 9 - 1; j >= i; j--) {
				System.out.print(j + " ");
			}

			System.out.println();

	
			
		}

	}

}
