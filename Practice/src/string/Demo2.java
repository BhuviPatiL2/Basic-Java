package string;

public class Demo2 {
	String s1 = "I like java programming";


	static void changeVowelCase(String s1) {
		// for (int i = 0; i < s1.length(); i++) {
		// char c1=s1.charAt(i);
		char arr[] = s1.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
				arr[i] = (char) (arr[i] - 32);
			} else if (arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U')

				arr[i] = (char) (arr[i] + 32);
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		String s1 = "I like java programming";
		changeVowelCase(s1);
	}

}
