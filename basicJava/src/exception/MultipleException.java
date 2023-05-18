package exception;
// 
public class MultipleException {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40};
		int a=100,b=0;
		String s="Bhuvaneshwari";
		
		
		try {
			System.out.println(arr[2]);
			//System.out.println(a/b);
			System.out.println(s.indexOf(24));
			System.out.println(a/b);
			
			
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException| StringIndexOutOfBoundsException e) {
			System.out.println("Do not enter denominator zero");
			e.printStackTrace();
			
		}
		//catch(ArithmeticException e) {
			
		}
	}


