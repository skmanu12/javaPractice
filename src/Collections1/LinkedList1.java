package Collections1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LinkedList class contains duplicate elements
		//LinkedList class uses dubly-linked list to store the elements
		//LinkedList class Maintains the insertion order
		//In LinkedList class, manipulation is fast,bcz no data shifting
		//Better for manipulation
		LinkedList<String> list=new LinkedList<String>();
		list.add("Praveen");
		list.add("Jeeta");
		list.add("Manappa");
		 
		
		Iterator<String> li = list.iterator();
		System.out.println("Before sort in descending: ");
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
Iterator<String> dlist = list.descendingIterator();
while(dlist.hasNext()) {
	System.out.println(dlist.next());
}
	}

}
