/*2.	If you do this Student s1 = new Student(); Student s2 = s1;
Now print sop(s1) sop(s2) see both reference variables are
pointing to same location.
But if you use new keyword for s1 and s2 see both values
would be different.*/
package writenTests;

public class Students {

	public static void main(String[] args) {
		Students s1 = new Students();
		//Students s2 = s1;
		System.out.println(s1);
		//System.out.println(s2);

		System.out.println("======================================");

		Students s2 = new Students();
		System.out.println(s2);
	

	}

}
