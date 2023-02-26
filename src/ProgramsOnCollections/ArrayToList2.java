package ProgramsOnCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String arr[]= {"two","three","one","five"};
System.out.println(Arrays.toString(arr));

List<String> list=Arrays.asList(arr);
System.out.print(list);
	}

}
