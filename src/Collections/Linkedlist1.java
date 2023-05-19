package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l = new LinkedList<String>();
		l.add("Jeeva");
		l.add("Pratu");
		l.add("Manu");
		System.out.println("Original list");
		Iterator it = l.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}
		System.out.println("Original list after add");
		l.add(0, "Shiva");
		Iterator it1 = l.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());

		}
		System.out.println("Create new list l2 add into the list l");
		LinkedList<String> l2 = new LinkedList<>();
		l2.add("Seeat");
		l.addAll(l2);
		Iterator it2 = l.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());

		}
		System.out.println("remove list L2");
		l.removeAll(l2);
		Iterator it3 = l.iterator();
		while (it3.hasNext()) {
			System.out.println(it3.next());

		}
	}

}
