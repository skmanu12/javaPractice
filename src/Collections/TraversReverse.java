package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TraversReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("Manu");
		list.add("Jeevan");
		list.add("Ninga");

		ListIterator<String> list1 = list.listIterator(list.size());
		while (list1.hasPrevious()) {
			System.out.println(list1.previous());

		}
	}

}
