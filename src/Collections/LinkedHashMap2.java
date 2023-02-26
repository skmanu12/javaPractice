package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> map=new HashMap<Integer,String>();
map.put(111, "Jeeva");
map.put(112, "Manu");
for(Map.Entry m:map.entrySet()) {
	System.out.println(m.getKey()+"-"+m.getValue());
}

	}

}
