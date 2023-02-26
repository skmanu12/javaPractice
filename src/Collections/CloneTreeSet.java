package Collections;

import java.util.TreeSet;

public class CloneTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> tree_set=new TreeSet<String>();
		tree_set.add("Manappa");
		tree_set.add("Seeta");
		tree_set.add("Seeta");
		tree_set.add("Jeeva");
		System.out.println(tree_set);
		
		TreeSet<String> set=(TreeSet<String>)tree_set.clone();
		System.out.println();

	}

}
