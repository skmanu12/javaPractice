package Collections;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> s = new LinkedHashSet<String>();
		s.add("Ravi");
		s.add("Ravi");
		s.add("Ravi");
		s.add("Ravi");
		s.add("Null");
		s.add("Null");
		for (String l : s) {
			System.out.println(l);
		}
	}

}
