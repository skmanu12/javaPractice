package Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> s = new TreeSet<String>();
		s.add("Ravi");
		s.add("null");
		s.add("null");
		s.add("Preeti");
		Iterator it = s.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
