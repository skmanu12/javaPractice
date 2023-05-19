package ProgramsOnCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] arr= {"one","two","three","four"};

System.out.println(Arrays.toString(arr));
List<String> arrayList = Arrays.asList(arr);

List<String> list=new ArrayList<String>();
for(String a:arr) {
	list.add(a);
}
System.out.println(list);
	}

}
