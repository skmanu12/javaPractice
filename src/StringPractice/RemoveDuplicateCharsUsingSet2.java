package StringPractice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharsUsingSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "JavaJ2EE";
		Set s=new HashSet();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++) {
		if(!s.contains(str.charAt(i))) {
			s.add(str.charAt(i));
			sb.append(str.charAt(i));
		}
			
		}
		System.out.println(s);
	}

}
