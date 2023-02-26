package Collections1;

import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //TreeSet class contains unique elements
    	//TreeSet class does not permits null
		//TreeSet class maintains ascending order
		TreeSet<String> set=new TreeSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Seven");
		//TreeSet class maintains ascending order
		System.out.println(set);
		  //TreeSet class contains unique elements
		set.add("One");
		System.out.println(set);
		//TreeSet class does not permits null
		//set.add(null);
		//System.out.println(set);
		//Set Highest and Lowest value
		System.out.println(set.pollFirst());
		System.out.println(set.pollLast());
	}

}
