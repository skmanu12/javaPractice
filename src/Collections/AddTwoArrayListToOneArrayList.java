package Collections;

import java.util.ArrayList;

public class AddTwoArrayListToOneArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Manappa");
		list1.add("Seeta");
		list1.add("Laxmi");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Sharanu");
		list2.add("Jeevaa");
		
		ArrayList<String> joined_list = new ArrayList<String>();
		joined_list.addAll(list1);
		joined_list.addAll(list2);
		
		System.out.println(joined_list);

	}

}
