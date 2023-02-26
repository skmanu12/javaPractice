package ProgramsOnCollections;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> map=new HashMap<Integer,String>();
map.put(101, "Manu");
map.put(102, "Kalmani");
map.put(103, "Sharan");
map.put(101, "Grams");
for(Map.Entry m:map.entrySet()) {
	System.out.println(m.getKey()+"-"+m.getValue());
}
map.putIfAbsent(104, "Jeevan");
System.out.println("After putIfAbsent:");
for(Map.Entry m:map.entrySet()) {
	System.out.println(m.getKey()+"-"+m.getValue());
}
HashMap<Integer,String> hm=new HashMap<Integer,String>();
hm.put(105, "Chandan");
hm.putAll(map);
System.out.println("After putAll:");
for(Map.Entry m:map.entrySet()) {
	System.out.println(m.getKey()+"-"+m.getValue());
}
	}

}
