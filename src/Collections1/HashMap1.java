package Collections1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //HashMap contains key value pair
		//HashMap contains unique values
		//HashMap contains one null key and multiple null values.
		//HashMap does not maintains insertion order.
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(111, "Manappa");
		map.put(112, "Seeta");
		map.put(113, "Jeeva");
		map.put(114, "Attige");
		//Unique element
		System.out.println(map);
		//No duplicate keys
		map.put(112, "Seeta");
		System.out.println(map);
		//HashMap contains one null key and multiple null values.
		map.put(null, "Jai");
		map.put(null, "Seeva");
		map.put(115, null);
		map.put(116, null);
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		//System.out.println(map);
	}

}
