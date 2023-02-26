package ProgramsOnCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String> set1=new HashSet<String>();
set1.add("Manu");
set1.add("Kalmani");
set1.add("Jay");
set1.add("Jay");
Iterator it=set1.iterator();
while(it.hasNext()){
	System.out.println(it.next());
	
}
Set<String> set2=new HashSet<String>();
set2.add("one");
set2.add("two");
set1.addAll(set2);
System.out.println(set1);
set1.remove("Manu");
System.out.println(set1);

//set1.removeAll(set2);
System.out.println(set1);
set1.clear();
System.out.println(set1);
	}

}
