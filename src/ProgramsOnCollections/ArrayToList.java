package ProgramsOnCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] array= {"one","two","three"};
System.out.println(Arrays.toString(array));
List<String> l=Arrays.asList(array);
System.out.println(l);

List ll=new ArrayList<>();
for(String s:array) {
	ll.add(s);
	
}
System.out.print(ll);
	}

}
