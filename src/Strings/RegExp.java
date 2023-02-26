package Strings;

import java.util.regex.Pattern;

public class RegExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches("[a-zA-Z0-9]{3}","a23"));//true-digits and chars
		System.out.println(Pattern.matches("[a-zA-Z0-9]{3}","a23hsjhdah"));//false-digits and chars are more than 3
		System.out.println(Pattern.matches("[a-zA-Z0-9]{3}","a$23"));//false-special symbol
		
		System.out.println(Pattern.matches("[879]{1}[0-9]{9}","6974294772"));//false-start with 6
		System.out.println(Pattern.matches("[879]{1}[0-9]{9}","697429477255"));//false-more digits
		System.out.println(Pattern.matches("[879]{1}[0-9]{9}","7974294772"));//true
		
		System.out.println(Pattern.matches("[879]{1}\\d{9}","6974294772"));//false-start with 6
	}

}
