package StringPractice;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Computer";
		System.out.println(s.length());

		// substring method
		String sub = s.substring(1, 4);
		System.out.println(sub);

		// split method
		String s1 = new String("Text me if for possible");
		String[] s2 = s1.split("\\ ");
		System.out.println(Arrays.toString(s2));

		// Upper case and Lower Case
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());

		// trim method

		String trim = " Sachin ";
		System.out.println(trim.trim());

		// startWith and endWith
		String start = "Sachin";
		System.out.println(start.startsWith("Sa"));
		System.out.println(start.endsWith("n"));

		// chartAt method
		System.out.println(start.charAt(2));

		// valueOf();The String class valueOf() method converts given type such as int,
		// long, float,
		// double, boolean, char and char array into String.
		int i = 10;
		String value = String.valueOf(i);
		System.out.println(value + 10);

		// replace method
		String rep = "Java is a programming language,Java is brand";
		String repString = rep.replace("Java", "Mava");
		System.out.println(repString);

	}

}
