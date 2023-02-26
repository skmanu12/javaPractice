package Collections;

import java.util.ArrayList;
import java.util.List;

public class BookTypeArrayList2 {
	int id;
	String name;
	String autor;
	BookTypeArrayList2(int id,String name,String autor){
		this.id=id;
		this.name=name;
		this.autor=autor;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookTypeArrayList2 b=new BookTypeArrayList2(123, "Shravan", "Manu");
		BookTypeArrayList2 b2=new BookTypeArrayList2(124, "Shree", "Jeevan");
		ArrayList<BookTypeArrayList2> al=new ArrayList<BookTypeArrayList2>();
		al.add(b);
		al.add(b2);
		for(BookTypeArrayList2 s:al) {
			System.out.println(s.id+"-"+s.name+"-"+s.autor);
		}
	}

}
