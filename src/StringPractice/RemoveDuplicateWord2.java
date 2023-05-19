package StringPractice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateWord2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java mava java programing".toLowerCase();
		String[] words = str.split(" ");
		Set s = new HashSet();
		for (int i = 0; i < words.length; i++) {
			if (!s.contains(words[i])) {
				s.add(words[i]);
			}

		}
		System.out.println(s);
	}

}
