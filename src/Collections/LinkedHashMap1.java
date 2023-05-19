package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(101, "Manu");
		map.put(101, "null");
		map.put(103, "null");
		map.put(null, "Manu");
		map.put(null, "Manu");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + "" + m.getValue());

		}

	}

}
