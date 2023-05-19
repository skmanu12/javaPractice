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
		for (int i = 0; i < ch.length; i++) {
			count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;

				}

			}

			if (count>1) {
				System.out.print(ch[i]);
			}

		}
		
		
	}

}
