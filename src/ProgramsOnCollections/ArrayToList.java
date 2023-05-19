package ProgramsOnCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] array= {"one","two","three"};
System.out.println(Arrays.toString(array));
List<String> arr = Arrays.asList(array);
System.out.println(arr);

List<String> a = Arrays.asList(array);
	}

}
