package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class reverseList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list=new LinkedList<String>();
		list.add("Manu");
		list.add("Seeta");
		list.add("Abhi");
		Iterator<String> rev = list.descendingIterator();
		while(rev.hasNext()) {
System.out.println(rev.next());			
		}
	}

}
