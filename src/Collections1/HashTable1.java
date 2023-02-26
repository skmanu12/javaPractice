package Collections1;

import java.util.Hashtable;
import java.util.Map;

public class HashTable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashTable contains unique elements
		//HashTable does not allow null keys and null values
		//HashTable does not maintains insertion order
		
Hashtable<Integer,String> hash=new Hashtable<Integer,String>();
hash.put(11, "Abhi");
hash.put(12, "Seeta");
hash.put(13, "Rama");
//Does not maintains insertion order
System.out.println(hash);
////HashTable contains unique elements
hash.put(11, "Maha");
System.out.println(hash);
//HashTable does not allow null keys and null values
hash.put(null, "Seeva");
hash.put(null, null);
for(Map.Entry h:hash.entrySet()) {
	System.out.println(h);
	
}
	}

}
