package ProgramsOnCollections;

import java.util.ArrayList;

public class AddAllArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("Manappa");
		list.add("Laxmi");
		list.add("Seeta");
		list.add("Rama");
		for(String l:list) {
			System.out.println(l);
		}
		
		list.remove(3);
		System.out.println("After removing index no 3 element: ");
		for(String l:list) {
			System.out.println(l);
		}
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Madhu");
		al.add("Darshan");
		System.out.println("Second ArrayList: ");
		for(String ll:al) {
			System.out.println(ll);
		}
		list.addAll(al);
		System.out.println("After addAll() ArrayList: ");
		for(String ll:list) {
			System.out.println(ll);
		}
		
		list.retainAll(al);
		System.out.println("After retainAll() ArrayList: ");
		for(String ll:list) {
			System.out.println(ll);
		}
	}

}
