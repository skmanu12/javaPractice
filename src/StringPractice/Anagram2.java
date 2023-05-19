package StringPractice;

import java.util.Arrays;

public class Anagram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Heart".toLowerCase();
		String str2="Earth".toLowerCase();
		
		
		if(str1.length()!=str2.length()) {
			System.out.println("Its not an anagrom");
		}else {
			char[] string1 = str1.toCharArray();
			char[] string2 = str2.toCharArray();
			Arrays.sort(string1);
			Arrays.sort(string2);
			if(Arrays.equals(string1, string2)==true) {
				System.out.println("Its an anagrom");
			}else {
				System.out.println("Its not an anagrom");
			}
		}
		
	}

}
