package Collection2;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList<String> l=new LinkedList<String>(); 
		 l.add("Manu");
		 l.add("Jeeva");
		 l.add("Chetana");
		 l.add("Renu");
		 l.removeFirst();
		Iterator<String> dcl = l.descendingIterator();
		 Iterator i=l.descendingIterator();
		 while(i.hasNext()) {
			 System.out.println(i.next());
			 
		 }
		 l.clear();
		 Iterator j=l.descendingIterator();
		 while(j.hasNext()) {
			 System.out.println(j.next());
			 
		 }

	}

}
