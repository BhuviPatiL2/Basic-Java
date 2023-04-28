package array;

import java.util.Arrays;
import java.util.Scanner;

public class TestBook {
	Scanner sc = new Scanner(System.in);
	Book b[] = new Book[2];

	public void bookdata() {
		for (int i = 0; i < b.length; i++) {
			System.out.println("Enter bookId,bookName and price of the book ");
			int bookId = sc.nextInt();
			String bookName = sc.next();
			int price = sc.nextInt();

			b[i] = new Book(bookId, bookName, price);

		}
	}

	public void enterprice() {
		// String name=bookName;
		for (int i = 0; i < b.length; i++) {
			for (int j = i + 1; j < b.length; j++) {
				if (b[i].price == b[j].price) {
					System.out.println(b[i].bookName);
					System.out.println(b[j].bookName);
				}
			}
		}
	}

	public void discount() {

		for (int i = 0; i < b.length; i++) {
			if (b[i].price > 300) {
				int price = b[i].price;
				int d = price / 20;
				price = price - d;
				System.out.println("Original Price " + b[i].price);
				System.out.println(price);
			}
		}

	}
	
	
	public void display() {
		System.out.println(Arrays.toString(b));
	}

	public static void main(String[] args) {
		TestBook obj = new TestBook();
		obj.bookdata();
		// obj.enterprice();
		// obj.display();
		obj.discount();

	}

}
