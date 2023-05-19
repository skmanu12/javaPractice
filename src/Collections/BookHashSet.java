package Collections;

import java.util.HashSet;

public class BookHashSet {
	String name;
	String auth;
	int price;

	BookHashSet(String name, String auth, int price) {
		this.name = name;
		this.auth = auth;
		this.price = price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<BookHashSet> s = new HashSet<BookHashSet>();
		BookHashSet b = new BookHashSet("Java", "MyName", 2000);
		BookHashSet b1 = new BookHashSet("C#", "Shorp", 3000);
		s.add(b);
		s.add(b1);
		for (BookHashSet b2 : s) {
			System.out.println(b2.name + " " + b2.auth + " " + b2.price);
		}
	}

}
