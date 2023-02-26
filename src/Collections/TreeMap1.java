package Collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<Integer,String> map=new TreeMap<Integer,String>();
map.put(100, "Manau");
map.put(101, "Java");
map.put(103, "Null");
map.put(102, "Sanu");
map.put(102, "Sanu");
map.put(105, null);
map.put(104, "");
for(Map.Entry m:map.entrySet()) {
	System.out.println(m.getKey()+" "+m.getValue());
	
}
	}

}
