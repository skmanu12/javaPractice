package Collection2;

import java.util.ArrayList;

public class Books {
int id;
String name;
String author;
Books(int id,String name,String author){
	this.id=id;
	this.name=name;
	this.author=author;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Books b=new Books(11,"Manappa","Shree");
		Books b2=new Books(12,"Mahantesh","Billsi");
		Books b3=new Books(13,"Santhos","Surekha");
		ArrayList<Books> list=new ArrayList<Books>();
		list.add(b);
		list.add(b2);
		list.add(b3);
		
		for(Books books:list) {
			System.out.println(books.id+" "+books.name+" "+books.author);
		}
	}

}
