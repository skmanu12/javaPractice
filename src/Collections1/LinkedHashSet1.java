package Collections1;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //LinkedHashSet contains unique elements
		// LinkedHashSet permits null lements
		// LinkedHashSet maintains insertion order
		LinkedHashSet<String> set=new LinkedHashSet();
		set.add("One");
		set.add("Three");
		set.add("Four");
		set.add("Four");
		set.add("Six");
		set.add(null);
		set.add(null);
		//Maintains insertion order
		System.out.println(set);
		//Unique elements
		System.out.println(set);
	}

}
