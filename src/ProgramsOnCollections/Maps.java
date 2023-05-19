package ProgramsOnCollections;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> map=new HashMap<Integer,String>();
map.put(101, "Manappa");
for(Map.Entry m:map.entrySet()) {
	System.out.println(m.getKey()+"-"+m.getValue());
}
map.putIfAbsent(102, "Seeta");
for(Map.Entry m:map.entrySet()) {
	System.out.println(m.getKey()+"-"+m.getValue());
}
map.putIfAbsent(102, "Seeta");
HashMap<Integer,String> m=new HashMap<Integer,String>();
m.put(101, "Sunitha");
m.put(102, "Manu");
map.putAll(m);
for(Map.Entry n:map.entrySet()) {
	System.out.println(n.getKey()+"-"+n.getValue());
}
	}

}
