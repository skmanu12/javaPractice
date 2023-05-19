package ProgramsOnCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetFromArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Manappa");
		list.add("Seta");
		list.add("Jeva");
		
		Set<String> set=new HashSet<String>(list);
		set.add("Jeeva");
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
			
	

	}

}
