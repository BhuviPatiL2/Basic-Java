package collections;

import java.util.ArrayList;

public class Generic_NonGenericCollection {
	void nongeneric() {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(200);
		al.add(100);
		al.add(290);
		al.add(11);
		al.add(2);
		al.add(56.9);
		al.add('b');
		al.add('h');
		al.add('v');
		al.add(new Student("Bhuvi", 23));
		al.add(new Student("Shweta", 21));

	

	for(Object o:al)
	{
		if (o.getClass().getSimpleName().equals("Integer")) {

			System.out.println(o);
		}

	}


}
	
	void generic() {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(2);
		al.add(12);
		al.add(1);
		al.add(3);
		al.add(9);
		al.add(2);
		al.add(32);
		al.add(89);
		al.add(0);
		al.add(11);
		al.add(8);
		
		for( int i=0;i)

		}


	}
		
	}
	public static void main(String[] args) {
		Generic_NonGenericCollection n=new Generic_NonGenericCollection();
		n.nongeneric();
	}
}
	
	