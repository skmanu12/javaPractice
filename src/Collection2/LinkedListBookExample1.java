package Collection2;

import java.util.LinkedList;

public class LinkedListBookExample1 {
	int id;
	String name;
	String author;
	int price;

	LinkedListBookExample1(int id, String name, String author, int price) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListBookExample1 b1 = new LinkedListBookExample1(112, "The Terminal", "John", 200);
		LinkedListBookExample1 b2 = new LinkedListBookExample1(113, "Master", "Martin", 350);
		LinkedListBookExample1 b3 = new LinkedListBookExample1(114, "The King", "Hune", 150);
		LinkedList<LinkedListBookExample1> l = new LinkedList<LinkedListBookExample1>();
		l.add(b1);
		l.add(b2);
		l.add(b3);

		for (LinkedListBookExample1 b : l) {
			System.out.println(b.id + "-" + b.name + "-" + b.author + "-" + b.price);
		}
	}

}
