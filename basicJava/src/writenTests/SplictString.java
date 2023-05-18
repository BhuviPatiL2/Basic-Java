package writenTests;

public class SplictString {
	public static void main(String[] arg) {
		String s = "HELLO$WORLD";

		char[] arr = s.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '$') {
				arr[i]=' ';
			}
			System.out.print(arr[i]);
		}
		
	}

}
