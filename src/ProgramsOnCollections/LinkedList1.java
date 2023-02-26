package ProgramsOnCollections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> li=new LinkedList<String>();
li.add("Vishnu");
li.add("Manu");
li.add("Shreekanth");
li.add("Riyaz");
System.out.println(li);
Iterator<String> it=li.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
	
}
LinkedList<String> ll=new LinkedList<String>();
ll.add("One");
ll.add("Two");
li.addAll(ll);
System.out.println(li);
LinkedList<String> lll=new LinkedList<String>();
lll.add("Three");
li.addAll(1,lll);
li.addFirst("Sharan");
li.addLast("Klamani");

System.out.println(li);
li.remove(3);
li.remove("One");
li.removeAll(ll);
System.out.println(li);
LinkedList<String> l4=new LinkedList<String>();
l4.add("a2");
l4.add("B2");
l4.add("C2");

System.out.println("Printing descending list: ");
Iterator<String> t=l4.descendingIterator();
while(t.hasNext()) {
	System.out.println(t.next());
	
}


	}

}
