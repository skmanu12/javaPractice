package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Manu");
		list.add("Kurihal");
		list.add("Add");
		System.out.println("Before Sort the array elements");
		for (String ele : list) {
			System.out.println(ele);
		}
		Collections.sort(list);
		System.out.println("After Sort the array elements");
		for (String ele : list) {
			System.out.println(ele);
		}
//trave
	}

}
