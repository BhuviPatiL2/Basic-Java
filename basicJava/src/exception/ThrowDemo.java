package exception;

import java.util.*;

public class ThrowDemo {

	int getStringlength(String s) {
		if (s == null) {
			throw new NullPointerException("String is nulll....Enter valid string !!!!!");
		}
		return s.length();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowDemo t = new ThrowDemo();
		Scanner sc = new Scanner(System.in);

		try {
			// String s=sc.next();
			String s = null;
			System.out.println(s.length());
		} finally {
			System.out.println("Done");
		}
	}
}
