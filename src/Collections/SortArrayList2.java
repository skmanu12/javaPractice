package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Manu");
		list.add("Seeta");
		list.add("Neetu");
		list.add("Sudeep");
		System.out.println("Before Sort:");
		for (String s : list) {
			System.out.println(s);
		}
		Collections.sort(list);
		System.out.println("After Sort:");
		for (String s : list) {
			System.out.println(s);
		}
	}

}
