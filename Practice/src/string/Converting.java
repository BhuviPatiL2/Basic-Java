package string;

public class Converting {
	static public void exCharAt(String s1) {
		char c = s1.charAt(4);
		System.out.println(c);
	}

	static public void lengthEx(String s1) {
		System.out.println(s1.length());
	}
	public static void main(String[] args) {
		String s1 = "Bhuvaneshwari";
		char ch[] = { 'p', 'a', 't', 'i', 'l' };
		String s3 = new String(ch); // converting char array to a string
		String s2 = new String("example");
		System.out.println(s1 + "  " + s2 + "  " + s3);
		
		
		exCharAt(s1);
		lengthEx(s1);
	}

//char c=s1.charAt(4)
}
