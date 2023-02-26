package Strings;

import java.util.regex.Pattern;

public class PatternsMatches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Pattern.matches(".s", "ms"));//true-2nd char is s
System.out.println(Pattern.matches(".s", "mcs"));////false (has more than 2 char)  
System.out.println(Pattern.matches("ms", "m"));
//
System.out.println(Pattern.matches("[amn]?", "mnm"));
System.out.println(Pattern.matches("[amn]?", "mku"));
System.out.println(Pattern.matches("[amn]?", "m"));
System.out.println(Pattern.matches("[amn]+", "mmm"));
System.out.println(Pattern.matches("[amn]*", "mmm"));
	}

}
