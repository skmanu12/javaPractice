package Collections1;

import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TreeMap contains only unique elements
		// TreeMap can not have null keys and can have multiple null values
		// TreeMap maintains ascending order
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(11, "Manappa");
		map.put(12, "Seeta");
		map.put(13, "Jai Kumar");
		//Maintains ascending order
		System.out.println(map);
		//TreeMap can not have null keys and can have multiple null values
		map.put(null, "Deva");
		map.put(null, null);
		map.put(null, null);
		System.out.println(map);
	}

}
