package StringPractice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharsUsingSet3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "JavaJ2EE";
		char[] ch = str.toCharArray();
		Set s = new HashSet();
		StringBuilder sb = new StringBuilder();
		for (char c : ch) {
			if (!s.contains(c)) {
				s.add(c);
				sb.append(c);
			}

		}
		System.out.println(sb);
	}

}
