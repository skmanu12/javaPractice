package ProgramsOnCollections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Manau");
		al.add("Seeta");
		al.add("Prema");
		al.add("Loki");
		System.out.print(al);
		String[] arr = al.toArray(new String[al.size()]);
		System.out.println(arr.toString());
	}

}
