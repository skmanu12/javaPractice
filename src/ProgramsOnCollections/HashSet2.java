package ProgramsOnCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet2 {

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
set1.removeIf(str->str.contains("Kalmani"));
Iterator it1=set1.iterator();
while(it1.hasNext()){
	System.out.println(it1.next());
	
}
	}

}
