package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. LinkedList stores the duplicate elements 2. LinkedList maintains insertion
		 * order 3. In LinkedList class, manipulation is faster than Array list bcz no
		 * shifting. 4. Java LinkedList class extends AbstractSequentialList class and
		 * implements List and Deque interfaces.
		 */
		LinkedList<String> list = new LinkedList<String>();
		list.add("Maney");
		list.add("Rupees");
		list.add("Cash");
		System.out.println("Before reverse the elements:");
		for (String li : list) {
			System.out.println(li);
		}

		System.out.println("Decending iterator:");
		Iterator<String> li = list.descendingIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}
	}

}
