package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> s=new HashSet<String>();
		s.add("Manu");
		s.add("Manu");
		s.add("Seeat");
		s.add("Java");
		Iterator it=s.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}
s.remove("Manu");
System.out.print(s);

//Create second hasSet
HashSet<String> s1=new HashSet<String>();
s1.add("Manau");
s1.add("Madhu");
System.out.print(s1);
s.addAll(s1);
System.out.println(s);
	}

}
