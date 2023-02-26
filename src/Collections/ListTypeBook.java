package Collections;

import java.util.ArrayList;
import java.util.List;

class Book1{
	int id;
	String name;
	String auth;
	Book1(int id,String name,String auth){
		this.id=id;
		this.name=name;
		this.auth=auth;
	}
}
public class ListTypeBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book1> li=new ArrayList<Book1>();
		Book1 b=new Book1(1, "Jurney", "Manappa");
		Book1 b1=new Book1(2, "Martin", "Sharan");
		li.add(b);
		li.add(b1);
		for(Book1 book:li) {
			System.out.println("Book details:"+book.id+" "+book.name+" "+book.auth);
		}

	}

}
