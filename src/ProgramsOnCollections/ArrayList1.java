package ProgramsOnCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al=new ArrayList<String>();
al.add("Shreekant");
al.add("Mannu");
al.add("Riyaz");
al.add("Vishnu");
al.add("BMW Santosh");
Iterator it=al.iterator();
System.out.println("--------------Using while loop---------------------");
while(it.hasNext()) {
	System.out.println(it.next());
}
System.out.println("--------------Using for each loop---------------------");
for(String li:al) {
	System.out.println(li);
}
System.out.println("--------------Methods----------------------------------");
System.out.println("get values from List"+al.get(3));
System.out.println("------------Set to the List-----------------------------");

al.set(3, "adhgjh");
for(String li:al) {
	System.out.println(li);
}
System.out.println("-------------Sort Collection----------------------------");
Collections.sort(al);
for(String li:al) {
	System.out.println(li);
}

	}

}
