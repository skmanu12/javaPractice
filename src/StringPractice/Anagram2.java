package StringPractice;

import java.util.Arrays;

public class Anagram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Heart";
		String str2="Earth";
		String s=str1.toLowerCase();
		String s2=str2.toLowerCase();
		if(s.length()!=s2.length()) {
			System.out.println("Its not an anagram");
		}else {
			char[] string1 = s.toCharArray();
			char[] string2 = s2.toCharArray();
			Arrays.sort(string1);
			Arrays.sort(string2);
			if(Arrays.equals(string1, string2)==true) {
				System.out.println("Its anagram");
			}else{
				System.out.println("Its not an anagram");
			}
		}
	}

}
