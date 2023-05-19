package ProgramsOnCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListToArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al=new ArrayList<String>();
al.add("Manappa");
al.add("Seeta");
al.add("Rama");
al.add("Jeevan");
String[] toArray = al.toArray(new String[al.size()]);
	}

}
