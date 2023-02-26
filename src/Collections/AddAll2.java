package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddAll2 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Seeta");
		al.add("Manu");
		System.out.print("First List: ");
		
		Collections.sort(al);
		for(String s:al) {
			
			System.out.println(s);
			
		}
		al.set(1, "about");
for(String s:al) {
			
			System.out.println(s);
			
		}
		System.out.print("After addAll:");
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("laxmi");
		al.addAll(al1);
		for(String s1:al) {
	
			System.out.println(s1);
		}
		System.out.println("After Sort: ");
		Collections.sort(al);
		for(String s2:al) {
			System.out.println(s2);
		}
		
	}

}
