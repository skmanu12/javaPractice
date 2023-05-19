package Collections;

import java.util.LinkedList;
import java.util.List;

public class BookLinkedList {
	String name;
	String auth;
	int price;

	BookLinkedList(String name, String auth, int price) {
		this.name = name;
		this.auth = auth;
		this.price = price;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<BookLinkedList> li = new LinkedList<BookLinkedList>();
		BookLinkedList b1 = new BookLinkedList("Life of", "John", 200);
		BookLinkedList b2 = new BookLinkedList("the lion", "mary", 300);
		BookLinkedList b3 = new BookLinkedList("U turn", "Dev", 500);
		li.add(b1);
		li.add(b2);
		li.add(b3);
		for (BookLinkedList books : li) {
			System.out.println(books.name + "-" + books.auth + " " + books.price);
		}

	}

}
