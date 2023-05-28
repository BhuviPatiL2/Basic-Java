package garbageCollection_finalize;

public class Book {
	String name;

	protected void finalize() {
		System.out.println(this.name + " book object is garbage collected ");
	}

	public static void main(String[] args) {
		Book b1 = new Book();
		b1.name = "xyz";
		Book b2 = new Book();
		b2.name = "abc";
		b1 = null; //eligible for garbage collection
		b2 = null;  //eligible for garbage collection
		System.gc();

	}

}
