package collections;
import java.util.*;
public class ListMethod {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();

		al.add(10);
		al.add(11110);
		al.add(110);
		al.add(1);
		al.add(19);
		al.add(18);
		al.add(90);
		al.add(10);
		al.add(90);
		
		System.out.println(al);
		//al.contains(al);
		System.out.println(al.indexOf(90));
		System.out.println(al.contains(0));
		System.out.println(al.lastIndexOf(90));
	}
	

}
