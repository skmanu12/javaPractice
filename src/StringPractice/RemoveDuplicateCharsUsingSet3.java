package StringPractice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharsUsingSet3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "JavaJ2EE";
		char[] c = str.toCharArray();
		Set s=new HashSet();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<c.length;i++) {
			if(!s.contains(c[i])) {
				s.add(c[i]);
				sb.append(c[i]);
			}
		
		}
		System.out.println(sb);
	}

}
