package Strings;

import java.util.regex.Pattern;

public class MetaChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches("\\d","2"));//true-digits 0-9
		System.out.println(Pattern.matches("\\d","23"));//false-more than once
		System.out.println(Pattern.matches("\\d","4sgdhs"));//false-chars
		
		// \\D
		System.out.println(Pattern.matches("\\D","23"));//false-digits
		System.out.println(Pattern.matches("\\D","a"));//true-chars
		System.out.println(Pattern.matches("\\D","mm"));//false-more chars
		System.out.println(Pattern.matches("\\D","23ss"));//false-digits and chars
		System.out.println(Pattern.matches("\\D*","maki"));//false-digits
	}

}
