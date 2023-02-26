package StringPractice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateWord2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java mava java programing";
		String str1 = str.toLowerCase();
		String[] words = str1.split(" ");
		Set s=new HashSet();
		StringBuilder sb=new StringBuilder();
		for(String wb:words) {
			if(!s.contains(wb)) {
				s.add(wb);
				sb.append(" "+wb);
			}
			
		}
		System.out.println(sb);
		
	}

}
