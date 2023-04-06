package datatype_variables;

public class PostAndPre_Increment {

	public static void main(String[] args) {
		int a = 10, b = 20, c, d, e;
		c = a++;
		e = ++a;
		d = ++b;

		System.out.println(c);
		System.out.println(e);
		System.out.println(d);

	}

}
