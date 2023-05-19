package Collections;

import java.util.Hashtable;

public class HashTable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String> map = new Hashtable<Integer, String>();
		map.put(100, "String");
		map.put(101, "Manu");
//map.put(null, null);
		map.put(102, "Jeeva");
		System.out.println(map);
		System.out.println(map.getOrDefault(101, "Not found"));
		System.out.println(map.getOrDefault(103, "Not found"));
	}

}
