package StringPractice;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "JavaJ2EE";

		char[] ch = str.toCharArray();
		int count;
//StringBuilder sb=new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			count = 1;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;

				}

			}

			if (count == 1) {
				System.out.print(str.charAt(i));
			}

		}
		Set s = new HashSet();
		StringBuilder sb = new StringBuilder();
		for (int k = 0; k < str.length(); k++) {
			if (!s.contains(str.charAt(k))) {
				s.add(str.charAt(k));
				sb.append(str.charAt(k));
			}

		}
		System.out.println(sb);
	}

}
