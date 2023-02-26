package StringPractice;

import java.util.Arrays;

public class Anagram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Heart";
		String str2="Earth";
		//compare lenght
		//covert string to charArray
		//sort the arrays
		//compare the two string and print
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		char[] string1 = str1.toCharArray();
		char[] string2 = str2.toCharArray();
		if(string1.length!=string2.length) {
			System.out.println("Its not anogram");
		}else {
			Arrays.sort(string1);
			Arrays.sort(string2);
			if(Arrays.equals(string1, string2)==true) {
				System.out.println("Its anagram");
			}else {
				System.out.println("Its not anagrom");
			}
		}
		
		
	}

}
