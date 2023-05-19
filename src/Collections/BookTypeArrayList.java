package Collections;

import java.util.ArrayList;
import java.util.List;

public class BookTypeArrayList {
	int id;
	String name;
	String Auather;

	BookTypeArrayList(int id, String name, String Auather) {
		this.id = id;
		this.name = name;
		this.Auather = Auather;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<BookTypeArrayList> list = new ArrayList<BookTypeArrayList>();
		BookTypeArrayList b1 = new BookTypeArrayList(123, "Ashoka", "Mouni");
		BookTypeArrayList b2 = new BookTypeArrayList(124, "Guru", "Radha");
		list.add(b1);
		list.add(b2);
		for (BookTypeArrayList books : list) {
			System.out.println(books.id + "-" + books.name + "-" + books.Auather);
		}
	}

}
