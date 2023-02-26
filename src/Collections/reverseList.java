package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class reverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l=new LinkedList<String>();
		l.add("Jeeva");
		l.add("Pratu");
		l.add("Manu");
		System.out.println("Original list");
		Iterator it=l.descendingIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
	}

}
