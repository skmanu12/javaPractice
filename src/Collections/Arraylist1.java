package Collections;

import java.util.*;

public class Arraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Test1");
		list.add("Manu");
		list.add("Seema");
		Iterator li = list.iterator();
		while (li.hasNext()) {
			System.out.println(li.next());

		}
		System.out.println("For each:");
		for (String l : list) {
			System.out.println(l);
		}
		System.out.println("For each after set:");
		list.set(0, "Rama");
		for (String l : list) {
			System.out.println(l);
		}
		System.out.println("For each after Sort:");
		Collections.sort(list);
		for (String l : list) {
			System.out.println(l);
		}
	}

}
