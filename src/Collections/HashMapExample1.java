package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> map=new HashMap<Integer,String>();
map.put(101, "Manu");
map.put(102, "Manu");
map.put(null,"Sharan");
map.put(103, "Kalmani");
map.put(103, "chetan");
map.put(null, "siddu");

for(Map.Entry m:map.entrySet()) {
	System.out.println(m.getKey()+"-"+m.getValue());
	
}

	}

}
