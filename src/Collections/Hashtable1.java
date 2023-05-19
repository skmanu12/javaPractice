package Collections;

import java.util.Hashtable;
import java.util.Map;

public class Hashtable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String> h = new Hashtable<Integer, String>();
		h.put(100, "Manu");
		h.put(101, "seeta");
		h.put(103, "Jeeva");
//h.put(null, "Jeeva");
//h.put(104, null);

		for (Map.Entry i : h.entrySet()) {
			System.out.println(i.getKey() + " " + i.getValue());
		}
	}

}
