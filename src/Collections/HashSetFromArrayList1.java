package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetFromArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
HashSet:
1.HashSet contains unique elements
2.HashSet allows null value
3.HashSet does not maintains the insertion order.
 */

ArrayList<String> list=new ArrayList<String>();
list.add("Manu");
list.add("Seeta");
list.add("Jeeva");
list.add("Seeta");
System.out.println("After copy from arrayList");
for(String s:list) {
	System.out.println(s);
	
}

Set<String> s=new HashSet<String>(list);
s.add("Abhi");
System.out.println("After copy from arrayList");
Iterator<String> it = s.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}
	}

}
