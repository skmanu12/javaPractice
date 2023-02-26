package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * ArrayList:
1.Stores the duplicate elements
2. Maintains the insertion order
3.ArrayList allow us to access the element randomely and it works based on index.
4. ArrayList manipulation is slow bcz lots of elements shifting occurs if any element 
is removed from the array list
 */
		ArrayList<String> list=new ArrayList<String>();
		list.add("Keshava");
		list.add("Manu");
		list.add("Abdul");
		
		// iterate the elements using itertaor interface
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			Object elements = itr.next();
			System.out.println(elements);
			
		}
		//Iterating the elements using for each
		for(String ele:list) {
			System.out.println(ele);
		}
		//Set and get elements
		list.add("Pratiksha");
		for(String ele:list) {
			System.out.println(ele);
		}
		list.set(3, "Jeeva");
		for(String ele:list) {
			System.out.println(ele);
		}
	}

}
