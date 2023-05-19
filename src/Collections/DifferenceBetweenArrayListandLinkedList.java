package Collections;

import java.util.regex.Pattern;

public class DifferenceBetweenArrayListandLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * 
		 * ArrayList : 1. ArrayList uses a dynamic array to store the elements. 2.
		 * Manipulation is slow using ArrayList bcz lots of shifting 3. Better for
		 * storing and accessing data LinkedList : 1. LinkedList uses doubly linked list
		 * to store the elements. 2. Manipulation is faster than ArrayList bcz it uses
		 * doubly linked list 3. Better for manipulating the data
		 */
		System.out.println(Pattern.matches("\\d", "1"));// true one digit
		System.out.println(Pattern.matches("\\d", "12"));// false digit more than one
		System.out.println(Pattern.matches("\\D", "n"));// true non digit
		System.out.println(Pattern.matches("\\D", "mds"));// non digit more than one character
		System.out.println(Pattern.matches("\\D*", "mds"));// non digit more than one character with *

		/*
		 * Create a regular expression that accepts alphanumeric characters only. Its
		 * length must be six characters long only.
		 */
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun12"));// true
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun122"));// false more than 6 characters
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun&12"));// false special characters

		/*
		 * Create a regular expression that accepts 10 digit numeric characters starting
		 * with 7, 8 or 9 only.
		 */
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9892457766"));
		System.out.println(Pattern.matches("[789][0-9]{9}", "9892457766"));
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "6892457766"));// start with 6

	}

}
