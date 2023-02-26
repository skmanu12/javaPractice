package Collections;

import java.util.Hashtable;
import java.util.Map;

public class HashtableBook {
	String name;
	int price;
	HashtableBook(int price,String name){
		this.name=name;
		this.price=price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashtableBook h=new HashtableBook(101,"Shruti");
		HashtableBook h2=new HashtableBook(102,"Manu");
		HashtableBook h3=new HashtableBook(103,"Seeta");
		HashtableBook h4=new HashtableBook(104,"sgh");
		
		Hashtable<Integer,HashtableBook> t=new Hashtable<Integer,HashtableBook>();
		t.put(1, h);
		t.put(2, h2);
		t.put(3, h3);
		t.put(4, h4);
		for(Map.Entry<Integer,HashtableBook> m:t.entrySet()) {
			int keys=m.getKey();
			HashtableBook b=m.getValue();
			System.out.println(keys+" "+b.name+" "+b.price);
			
		}
		
	}

}
