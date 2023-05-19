package StringPractice;

import java.util.Arrays;

public class Anagram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Heart".toLowerCase();
		String str2 = "Earth".toLowerCase();
		// compare lenght
		// covert string to charArray
		// sort the arrays
		// compare the two string and print
		if(str1.length()!=str2.length()) {
			System.out.println("Its not an anagram");
		}else {
			char[] string1 = str1.toCharArray();
			char[] string2 = str2.toCharArray();
			Arrays.sort(string1);
			Arrays.sort(string2);
			if(Arrays.equals(string1, string2)==true) {
				System.out.println("Its anagram");
			}else {
				System.out.println("Not an anagram");
			}
		}
	}

}
