package Collections1;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//HashSet class inherits AbstarctSet and Implements Set
		//HashSet: stores the unique elements
		//HashSet does not maintains insertion order
		//HashSet allows null value
		//HashSet better for searching operation
		HashSet<String> set=new HashSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		set.add("Five");
		//Does not maintains insertion order
		System.out.println(set);
		//Avoid duplicate elements
		System.out.println(set);
		//REmove elemenent
		set.remove("Two");
		System.out.println(set);
		HashSet<String> set2=new HashSet<String>();
		set2.add("Seven");
		set2.add("Ten");
		set.addAll(set2);
		System.out.println(set);
		set.removeAll(set2);
		System.out.println(set);
		

	}

}
