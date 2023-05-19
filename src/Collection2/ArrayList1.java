package Collection2;
import java.util.*;
public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		**************List***************
		**ArrayList:
		1. ArrayList Uses dynamic array
		2. ArrayList can have duplicate elements
		3. ArrayList maintains the insertion order.
		4. ArrayList inherits the AbstarctList and implements the List interface
		5. ArrayList allows random access bcz the array works on an index basis.
		6. ArrayList manipulation is little bit slower than the linkedList in Java bcz a 
		   lot of shifting needs to occur if any element is removed from the array list.
		   */
		ArrayList<String> list=new ArrayList<String>();
		list.add("A");
		list.add("B");
		/*Iterator it=list.iterator();
		while(it.hasNext()) {
			String str=it.next().toString();
			System.out.println(str);

		}*/
	
		list.set(1, "C");
		list.add("E");
		list.add("D");
		list.add("D");
		//Collections.sort(list);
		System.out.println("For each loop:");
		for(String li:list) {
			System.out.println(li);
			
		}
	
		
	}

}
