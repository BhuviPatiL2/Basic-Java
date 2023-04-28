package array;

import java.util.*;

public class Book {

	
	int bookId, price;
	String bookName;

	Book(int bookId, String bookName, int price) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
	}

	public String toString() {
		return bookId + " " + bookName + " " + price;

	}

}
