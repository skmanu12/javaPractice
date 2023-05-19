package Collections;

import java.util.HashMap;

public class CollectionViewOfHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Appa");
		map.put(2, "Jeeva");
		map.put(3, "Seeta");
		map.put(4, "Manu");
		System.out.println(map);
		// Collection View of HashMap
		System.out.println(map.values());

	}

}
