package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * HashMap: 1. HashMap contains key, value pair 2. HashMap contains unique keys
		 * 3. HashMap contains one null keys and multiple null value 4. HashMap
		 * maintains no order.
		 */
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(101, null);
		hm.put(102, null);
		hm.put(null, "Jeevan");
		hm.put(103, "Shreedevi");
		hm.put(104, "Shreedevi");

		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + "-" + m.getValue());
		}
//
		System.out.println("After adding the element");
		hm.putIfAbsent(105, "Rudra");
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + "-" + m.getValue());
		}

//Another HashMap
		System.out.println("After adding another HashMap:");
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(106, "Swamy");
		hm.putAll(map);
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + "-" + m.getValue());
		}
		System.out.println("After remove");
		hm.remove(101);
		System.out.println(hm);
		System.out.println("Replace the object");
		hm.replace(102, "Madhu");
		System.out.println(hm);
	}

}
