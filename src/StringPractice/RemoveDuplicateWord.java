package StringPractice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "The Java programing is java java programing The is";
		String str1 = str.toLowerCase();
		String words[] = str1.split(" ");

		Set s=new HashSet();
		StringBuilder sb=new StringBuilder();
		for(String wrd:words) {
			if(!s.contains(wrd)) {
				s.add(wrd);
				sb.append(wrd+" ");
			}
			
		}
		System.out.println(sb);
		
	}

}
