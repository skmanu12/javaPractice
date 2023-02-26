package ProgramsOnCollections;

import java.util.ArrayList;

public class AddAllArrayList {

public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al=new ArrayList<String>();
al.add("One");
al.add("Two");
al.add("Three");
al.add("Four");
al.add("Five");
for(String li:al) {
	System.out.println(li);
}
ArrayList<String> al2=new ArrayList<String>();
al2.add("Six");
al2.add("Seven");
al2.add("Two");
al.addAll(al2);
System.out.println(al);
al.remove(0);
System.out.println("Remove element from the lists:");
System.out.println(al);
System.out.println("Remove element from the ArrayList2:");
//al.removeAll(al2);
System.out.println(al);
al.retainAll(al2);
System.out.println(al);

	}

}
