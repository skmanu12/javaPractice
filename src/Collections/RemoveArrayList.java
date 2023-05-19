package Collections;

import java.util.ArrayList;

public class RemoveArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Manau");
		al.add("Seeat");
		al.add("Rudra");
		al.add("Ramesh");
		System.out.println("ArrayList1:");
		for (String list1 : al) {
			System.out.println(list1);
		}
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Madhu");
		al1.add("Ramesh");
		al.addAll(al1);
		System.out.println("ArrayList2:");
		for (String list2 : al) {
			System.out.println(list2);
		}

		System.out.println("After remove:");

		al.remove(1);
		for (String list2 : al) {
			System.out.println(list2);
		}
		System.out.println("ArrayList 3:");
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Team");
		al2.add("Qa");
		al1.add("Ramesh");
		al.addAll(al2);
		for (String list3 : al) {
			System.out.println(list3);
		}
		al.removeAll(al1);
		System.out.println("After remove of al1:");
		System.out.println(al);
//al.clear();
//System.out.println(al);
		al.retainAll(al2);
		System.out.println(al);
	}

}
