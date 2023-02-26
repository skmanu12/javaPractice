package ProgramsOnArray;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l1 = new LinkedList<>();

		l1.add(1);

		l1.add(2);

		l1.add(3);

		System.out.println(l1);

		LinkedList<Integer> l2 = new LinkedList<>();

		l1.descendingIterator().forEachRemaining(l2::add);
		System.out.println(l2);
	}

}
