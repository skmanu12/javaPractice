package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapBook1 {
int id;
String name;
HashMapBook1(int id,String name){
	this.id=id;
	this.name=name;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMapBook1 b1=new HashMapBook1(1001,"Madhu");
		HashMapBook1 b2=new HashMapBook1(1002,"Jeeva");
		
		HashMap<Integer,HashMapBook1> map=new HashMap<Integer,HashMapBook1>();
		map.put(1, b1);
		map.put(2, b2);
		for(Map.Entry<Integer, HashMapBook1> entry:map.entrySet()) {
			int id=entry.getKey();
			HashMapBook1 b=entry.getValue();
			System.out.println(id+":Details");
			System.out.println(b.id+"-"+b.name);
		}
	}

}
