package Collections1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ArrayListSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList uses the dynamic array to store the elements
		//ArrayList stores the duplicate elements
		//ArrayList maintains the insertions order
		//ArrayList is better for searching the elements, it search based on index
		// Java ArrayList allows random access because the array works on an index basis.
		//Performance is slow than linkedList
		//Better for storing and accessing
List<String> list=new ArrayList<String>();
list.add("Manappa");
list.add("Rama");
list.add("Laxman");
System.out.println(list);
Collections.sort(list);
System.out.println(list);
ListIterator<String> li = list.listIterator(list.size());
while(li.hasPrevious()) {
	System.out.println(li.previous());
}
	}

}
