package Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetFromAnotherCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> a=new ArrayList<String>();
a.add("Madhu");
a.add("Javva");
a.add("Kalu");
System.out.println(a);
HashSet<String> s=new HashSet(a);
s.add("Sudha");
System.out.println(s);
	}

}
