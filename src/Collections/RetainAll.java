package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class RetainAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> al=new ArrayList<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ajay");  
		   
		  ArrayList<String> al2=new ArrayList<String>();  
		  al2.add("Ravi");  
		  al2.add("Hanumat"); 
		  al2.add("Ajay");
		  al.retainAll(al2);
		  System.out.println("iterating the elements after retaining the elements of al2");  
		  Iterator itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
	}

}
