package Collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(101, "manappa");
		map.put(102, "Jeevan");
		map.put(103, "Madhu");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + "-" + m.getValue());
		}

	}

}
