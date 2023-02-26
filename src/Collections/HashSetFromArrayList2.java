package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetFromArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
HashSet:
1.HashSet contains unique elements
2.HashSet allows null value
3.HashSet does not maintains the insertion order.
 */
		ArrayList<String> list=new ArrayList<String>();
		list.add("Manu");
		list.add("Seeat");
		list.add("Rudra");
		for(String s:list) {
			System.out.println(s);
		}
		System.out.println("After HashSet from another collection:");
		Set<String> set=new HashSet<String>(list);
		set.add("Pratiksha");
		Iterator<String> s = set.iterator();
		while(s.hasNext()) {
			System.out.println(s.next());
		}
	}

}
