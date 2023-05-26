package collections;

import java.util.*;

public class List_String {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Bhuvi");
		al.add("Shweta");
		al.add("Kunal");
		al.add("Shivani");
		al.add("Shivraj");
		al.add("Hardik");
		al.add("Nilam");
		for (String i : al) {
			System.out.println(i+" ::"+i.length());
		}
	}
}