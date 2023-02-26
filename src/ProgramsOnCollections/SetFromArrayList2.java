package ProgramsOnCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetFromArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("Jeevan");
		list.add("Mounesh");
		list.add("Jeeva");
		list.add("Jeeva");
		for(String l:list) {
			System.out.println(l);
		}
		HashSet<String> set=new HashSet<String>(list);
		list.add("Praveen");
		list.add("Praveen");
		System.out.println(set);
		
		
	}

}
