package RegExpressions;

import java.util.regex.Pattern;

public class AcceptsAlphaNumericValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Pattern.matches("[a-zA-Z0-9]{7}"
		+ "", "Arunak7"));
System.out.println(Pattern.matches("[a-zA-Z0-9]{5}"
		+ "", "Aru$n7"));
System.out.println(Pattern.matches("[789]{1}[0-9]{9}"+"", "9724884848"));
		
		
	}

}
