package ProgramsOnCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetFromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> list=new ArrayList<String>();  
         list.add("Ravi");  
         list.add("Vijay");  
         list.add("Ajay");  
         System.out.println(list);
         HashSet<String> set=new HashSet<String>(list);
         set.add("Ashoka");
         Iterator it=set.iterator();
         while(it.hasNext()) {
        	 System.out.println(it.next());
        	 
         }
	}

}
