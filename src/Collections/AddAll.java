package Collections;

import java.util.ArrayList;
import java.util.List;

public class AddAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Manu");
		al.add("Jeeva");
		al.add("Madhu");
		for (String list : al) {
			System.out.println(list);
		}
		List<String> al1 = new ArrayList<String>();
		al1.add("Shilpa");
		al.addAll(al1);
		for (String list : al) {
			System.out.println(list);
		}
		System.out.println("Array List3:");
		List<String> al2 = new ArrayList<String>();
		al2.add("Murthy");
		al.addAll(2, al2);
		for (String list : al) {
			System.out.println(list);
		}
	}

}
