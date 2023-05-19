 package ProgramsOnCollections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al=new ArrayList<String>();
al.add("Manu");
al.add("Sharan");
al.add("BMW");
System.out.println(al);
String[] array=al.toArray(new String[al.size()]);
System.out.println(Arrays.toString(array));

String[] arr=al.toArray(new String[al.size()]);
String[] arr1=al.toArray(new String[al.size()]);
	}

}
